package view;

import controller.MainController;
import controller.RegionController;
import model.MainModel;
import view.RegionPanel.GridLayoutPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppView extends JFrame{
    public MainPanel mainPanel;
    public RegionPanel regionPanel;
    public DetailPanel detailPanel;
    private static MainController mainController;
    private static RegionController regionController;

    private String[] regions = new String[] {
            "경기도",
            "강원도",
            "충청북도",
            "충청남도",
            "전라북도",
            "전라남도",
            "경상북도",
            "경상남도",
            "제주도"
    };

    public String[][] names2 = new String[][] {};
    private String[] names = new String[]{
    		 "파주 임진각",
             "인천 송도 센트럴파크",
             "수원 화성",
             "광주 화담숲",
             "포천 아트밸리",
             "용인 에버랜드",
             "시흥 갯골생태공원",
             "가평 아침고요수목원",
             "포천 한탄강 주상절리길 ",
             "시흥 오이도",
             "춘천 남이섬",
             "인제 원대리 자작나무 숲",
             "원주 소금산 출렁다리",
             "삼척 이사부길",
             "홍천 은행나무숲",
             "고성 하늬라벤더팜",
             "춘천 해피초원목장",
             "평창 대관령눈꽃마을",
             "홍천 힐리언스 선마을",
             "동해 논골담길",
             "단양강 잔도",
             "단양 만천하 스카이위크",
             "청주 청남대",
             "제천 용추폭포 유리전망대",
             "제천 청풍호반케이블카",
             "단양 보발재",
             "단양 수양개빛터널",
             "충추 능암온천랜드",
             "단양 도담삼봉",
             "옥천 수생식물학습원",
             "대전 유성온천",
             "서산 웅도",
             "예산 예당호 출렁다리",
             "서산 유기방가옥",
             "서천 판교마을",
             "논산 온빛자연휴양림",
             "태안 안면도",
             "아산 세계꽃식물원",
             "태안 꽂지해수욕장",
             "금산 지구별그림책마을",
             "군산 선유도",
             "순창 용궐하늘길",
             "전주 한옥마을",
             "순창 강천사",
             "군산 고군산군도",
             "부안 내변산",
             "진안 마이산벚꽃길",
             "남원 허브밸리",
             "정읍 내장산국립공원",
             "순창 채계산 출렁다리",
             "고흥 거금도",
             "구례 산수유꽃축제",
             "강진 가우도",
             "여수 벽화마을",
             "담양 메타세쿼이아길",
             "영광 백수해안도로",
             "광양 매화마을",
             "순천 순천만자연생태공원",
             "부산 해운대",
             "여수 해상케이블카",
             "포항 하옥계곡",
             "경주 동궁과 월지",
             "영주 부석사",
             "안동 낙강물길공원",
             "울진 등기산스카이워크",
             "경주 불국사",
             "포항 호미반도 해안둘레길",
             "경주 첨성대",
             "안동 하회마을",
             "문경 에코랄라",
             "창원 진해군항제",
             "김해 가야컨트리클럽",
             "남해 바람흔적미술관",
             "거제 매미성",
             "거창 감악산",
             "합천 영상테마파크",
             "거제 바람의 언덕",
             "남해 독일마을",
             "거제 외도 보타니아",
             "통영 스카이라인 루지",
             "성산 일출봉",
             "우도",
             "제주 올레길 축",
             "섭지코지",
             "중문관광단지",
             "비자림",
             "만장굴",
             "새별오름",
             "휴애리자연생활공원",
             "산굼부리",
    };

    public String[] positions = new String[] {
            "파주시 문산읍임진각로164",
            "인천 연수구 컨벤시아대로160",
            "경기도 수원 팔달구 정조로 910",
            "경기도 광주시 도척면 도척윗로 278-1",
            "경기도 포천시 신북면 아트밸리로 234",
            "경기도 용인시 처인구 포곡읍 에버랜드로 199",
            "경기도 시흥시 동서로 287",
            "경기도 가평군 상면 수목원로 432",
            "경기도 포천시 영북면",
            "경기도 시흥시 오이도로 175",
            "강원도 춘천시 남산면 남이섬길 1",
            "강원도 인제군 인제읍 자작나무숲길 760",
            "강원도 원주시 지정면 소금산길 12",
            "강원도 삼척시 새천년도로 61-18",
            "강원도 홍천군 내면 광원리 686-4",
            "강원도 고성군 간성읍 꽃대마을길 175",
            "강원도 춘천시 사북면 춘화로 330-48",
            "강원도 평창군 대관령면 차항서녘길 27-22",
            "강원도 홍천군 서면 종자산길 122",
            "강원도 동해시 일출로 97",
            "충청북도 단양군 단양읍 삼봉로 31",
            "충청북도 단양군 적성면 옷바위길 10",
            "충청북도 청주시 상당구 문의면 청남대길 646",
            "충청북도 제천시 의림지로 33",
            "충청북도 제천시 청풍면 문화재길 166",
            "충청북도 단양군 가곡면",
            "충청북도 단양군 적성면 수양개유적로 390",
            "충청북도 충주시 앙성면 새바지길 37",
            "충청북도 단양군 매포읍 삼봉로 644",
            "충청북도 옥천군 군북면 방아실길 255"
    };

    public String[] informations = new String[] {
    };

    private MainModel[] dummyData = new MainModel[90];
    public String name2;
    private void createDummy(String[] region, String[] name, String[] position, String[] information) {
        MainModel model;
        for (int i = 0; i < name.length; i++) {
            int regionNumber = i / 10;
            model = new MainModel(region[regionNumber], name[i], position[i], information[i]);
            dummyData[i] = model;
        }
    }

    public AppView() {
        setTitle("main");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,900);
        createDummy(regions, names, positions, informations);
        mainPanel = new MainPanel();
        
        regionPanel = new RegionPanel(regions, names2[0], 0);
        //regionPanel.gridLayoutPanel = new GridLayoutPanel();
        
        detailPanel = new DetailPanel(name2,positions[0],informations[0]);
        getContentPane().add(mainPanel);
        
        MenuBar menuBar = new MenuBar();
        this.setJMenuBar(menuBar);
        setVisible(true);
    }

    public void change(String str) {
        getContentPane().removeAll();
        if(str == "m")
        	getContentPane().add(mainPanel);
        else if(str == "r")
        	getContentPane().add(regionPanel);
        else if(str == "d")
        	getContentPane().add(detailPanel);
        revalidate();
        repaint();
    }
    
    public void regionChange(int regionNo) {
    	getContentPane().removeAll();
    	this.regionPanel = new RegionPanel(regions, names2[regionNo], regionNo);
    	//각 버튼에 이미지 할당
    	//this.regionPanel = new RegionPanel(regions, tripImage2[regionNo], regionNo);
    	getContentPane().add(regionPanel);
    	
    	revalidate();
        repaint();
    }

    public void detailChange(String name2, String positions, String informations){
        this.detailPanel = new DetailPanel(name2,positions,informations);
    }
}
