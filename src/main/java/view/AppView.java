package view;

import controller.MainController;
import controller.RegionController;
import model.MainModel;

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

    private String[] names = new String[] {
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
            "옥천 수생식물학습원"
    };

    private String[] positions = new String[] {
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

    private String[] informations = new String[] {
            "비무장지대의 현실적인 모습을 볼 수 있다.\n" + "임진각, 북한기념관 등 통일 안보관광지\n",
            "인천 근린공원\n" + "호텔, 큰 공원, 배 탑승 가능\n" + "한옥 식당 가성비 좋음\n" + "일광욕과 도시뷰 감상 가능\n",
            "축조 시 기록이 남아있는 유일한 곳이다.\n" + "화성성역의궤로 복원 유지 중\n" + "화성 성곽\n",
            "생태수목원\n" + "숲의 식생을 최대한 보존한 곳이다\n" + "5km 완만한 데크길로 조성된 산책길\n" + "이끼원, 자작나무숲, 분재원 등\n" + "멸종 위기종의 생태복원을 휘안 서식환경 연구\n",
            "버려진 채석장을 복합문화공간으로 재탄생 시켰다.\n" + "조각 공원, 돌계단, 돌 문화 홍보 전시관 등이 있다.\n",
            "1년, 계절별 다양한 축제와 어트랙션, 동식물 등 다양한 시설이 있는 테마정원.\n" + "무대공연, 불꽃쇼\n" + "AZA 인증을 받은 동물원\n",
            "경기도 유일 내만갯벌과 옛염전의 정취를 느낄 수 있는 공원\n" + "칠면초, 나문재, 퉁퉁마디 등 염생식물을 관찰 가능\n" + "붉은발농게, 방게 등 관찰 가능\n" + "생태환경 1등급이며, 국가 해양습지보호지역으로 지정되있다.\n",
            "축령산의 자연경관을 배경으로 원예학적으로 조화시켜 설계한 원예수목원\n" + "삼림욕을 즐길 수 있어 쉼터를 제공한다.\n" + "20개의 정원과 잔디밭, 화단이 있고, 백두산 식물 300여종을 포함한 5,000여 종의 식물들이 있다.\n",
            "한반도 지형과 하천 침식 작용으로 생긴 멍우리 협곡 등 볼 수 있다.\n" + "구라이길, 가마소길, 벼룻길, 멍우리길 등 총 52km에 이르는 코스가 있다.\n" + "한탕강 하늘다리와 비둘기낭폭포를 볼 수 있는 비둘기순환코스가 인기가 높다.\n",
            "어패류가 많이 나는 관광지\n" + "신석기 시대를 비롯 각 시기 유적이 여러 차례 발굴된 중요 유적지\n" + "삼면이 바다이므로 만조와 썰물, 저녘 등 각기다른 아름다운 모습을 볼 수 있다.\n",
            "동화나라, 노래의 섬을 컨셉\n" + "콘서트, 전시, 문화행사 등을 개최하고 있다.\n" + "박물관, 그림책놀이터, MICE센터, 투개더파크, 유니세프 라운지 등 시설과 식음시설 테마 숙박시설이 갖춰져있다.\n",
            "자연생태관광지, 1974~1995년부터 690000본 자작나무를 조림하여 만들어졌다.\n" + "자작나무 숲만이 간직한 생태적, 심미적, 교육적 가치를 발굴하여 제공.\n" + "겨울철 하얀 자작나무 숲은 사진 촬영 장소로 인기가 좋다. 가족 단위 관광객은 유아 숲속 교실, 자연 체험 활동을 즐길 수 있다.\n",
            "길이 200m, 높이100m, 폭 1.5m로 산악 보도교 중 국내 최장, 최고의 규모.\n" + "소금산 암벽 봉우리 스카이 전망대는 섬강의 풍광을 감상 할 수 있다.\n" + "주변에 원주 레일바이크와 뮤지엄산, 조엄 묘역 등 원주 문화를 즐길 수 있다.\n" + "\n",
            "동해안의 푸른 바다를 온몸으로 맞으며 달릴 수 있는 4.8㎞의 해안도로로 삼척해수욕장과 삼척항을 잇는 도로\n" + "자연이 깎고 다듬은 시암괴석과 송림이 어우러져 멋진 경관을 연출한다.\n",
            "5m간격으로 은행나무만 2,000여 그루가 오와 열을 맞춰 심어져 있어 노랑게 물든 은행잎이 장관을 연출하고 인근에는 삼봉약수와 구룡령도 가까워 최고의 가을 여행지로 손꼽히고 있다. 해마다 10월이면 한 달 동안 일반인에게 개방되는 홍천 은행나무 숲은 한 개인이 30년 동안 가꾼 숲이다.",
            "2006년부터 3만 3000여 ㎡에 라벤더를 심어 조성한 곳이다. 경기도 의왕시에서 허브 숍을 운영하던 하 대표는 허브 제품의 원료가 되는 라벤더를 직접 재배하려고 이곳에 정착했다. 겨울에 눈이 많이 오면서도 따뜻한 고성은 우리나라에서 라벤더가 자라기에 가장 좋은 기후 조건을 갖췄다.",
            "춘천 사북면의 산 중턱에 자리한 해피초원목장은 체험 목장, SNS 인생 사진 명소\n" + "약 23만 1,400㎡(7만 평) 초지에 펼쳐지는 목장은 한우를 방목하는 강원 한우 체험 농장\n" + "소, 양, 토끼, 염소 등 다양한 동물들에게 직접 먹이를 주며 교감할 수 있다\n",
            "백두대간 준령인 황병산 자락 아래 위치한 작은 농산촌마을.\n" + "봄에는 잔설 속에서 피어나는 얼레지를 비롯한 곰취, 곤드레 등을 이용한 산채체험\n" + "여름에는 특전사의 유격체험과 가마솥 걸고 곤드레밥 지어먹기 체험 \n" + "가을에는 가족과 당나귀 타고 산책로 소풍 가기와 나만의 식물도감 만들기 체험 \n" + "겨울에는 눈썰매를 비롯한 다양한 눈 놀이 체험 등이 운영한다.\n",
            "국내 최초 웰에이징 힐링리조트\n" + "웰에이징을 위한 식습관, 운동습관, 마음습관, 생활리듬습관을 몸에 익힐 수 있는 다양한 힐링 프로그램을 체험할 수 있다. \n" + "한국관광공사 선정 ‘웰니스 51선’, 문화체육관광부 선정 ‘한국 10대 관광코스 치유투어’로 꼽힌다\n",
            "논골담길은 1941년 개항된 묵호항의 역사와 마을 사람들 삶의 이야기를 고스란히 간직한 감성스토리 마을로 동해문화원이 주관한 2010 어르신생활문화전승사업 묵호등대담화마을 ''논골담길''프로젝트를 시작으로 지역 어르신과 예술가들이 참여했다.\n" + "독특하고 예쁜 카페가 많아 쉬어갈 수 있다.\n",
            "총 길이 1.2km의 단양강 잔도길에는 그동안 접근하기 어려웠던 남한강 암벽을 따라 잔도가 있어 트래킹의 낭만과 짜릿한 스릴을 온몸으로 체험할 수 있다.\n" + "2020 야간관광 100선에 선정\n" + "인근의 이끼터널, 만천하 스카이워크, 수양개선사유물전시관, 수양개 빛터널 같은 볼거리 조성\n",
            "남한강 절벽 위에서 80~90m 수면아래를 내려보며 하늘길을 걷는 스릴이 있다.\n" + "전망대로 가는 나선형 구간에서는 다각도로 풍광을 감상할 수 있고, 전망대에 보이는 산등성이 너머 드넓게 흐르는 남한강 경치가 있다.\n" + "980m 길이의 짚와이어, 1,000m 거리의 알파인코스터, 슬라이드 등 체험 시설도 다양하다.\n",
            "대청호반에 자리 잡고 있는 청남대는 \"따뜻한 남쪽의 청와대\"라는 뜻으로 1983년부터 대한민국 대통령의 공식 별장으로 이용되던 곳이다.\n" + "청남대에 비경을 한 눈에 담을 수 있는 ''행복의 645계단', 전망대가 있다.\n",
            "바닥 부분에 투명 유리와 불투명 유리가 섞여 있는데, 철제 기둥에 설치된 센서를 지나면 불투명 유리가 투명 유리로 바뀌어 폭포가 내려다보인다.\n" + "폭포 위를 산책하는 듯한 느낌을 받을 수 있다.\n",
            "청풍호반 케이블카는 청풍면 물태리에서 비봉산 정상까지 2.3km 구간을 왕복 운행하는 케이블카 시설로 오스트리아에 본사를 둔 도펠마이어社의 최신 기종인 D-Line 모델이다. \n" + "10인승 캐빈 43대가 운행되며 10개의 캐빈은 바닥이 투명한 크리스탈 캐빈으로 구성되어 있다.\n",
            "굽이굽이 단풍길로 유명한 보발재는 가곡면 보발리와 영춘면 백자리를 잇는 고갯길로 해발 540m 위치한 드라이브 명소다.\n" + "약 3km 도로변을 따라 아름답게 펼쳐진 단풍은 소백산과의 조화로 찾는 이들의 감성을 자극한다. 정상에 위치한 전망대는 많은 사진작가들도 찾게 한다.\n",
            "국내 최초로 터널 전체를 빛의 테마로 조성한 복합 멀티미디어 공간이다.\n" + "일제강점기에 건설된 수양개 터널은 최신영상, 음향시설, LED 미디어 파사드 등을 접목시킨 복합멀티미디어 공간으로 재탄생 하였다.\n",
            "약수물을 마시면서 온천욕을 즐길 수 있다.\n" + "탄산약수를 마시며 지속적인 입욕을 하면 신장병, 위장병, 빈혈, 불면증, 비만, 변비 등에도 뛰어난 효과를 볼 수 있다.\n" + "온천 외에도 능암온천한증막과 유앤스파탄산온천 등의 황토한증막이 있어 한증막을 즐기려는 관광객에게 좋다.\n",
            "남한강의 맑고 푸른 물이 유유히 흐르는 강 한가운데 위치했다.\n" + "도담삼봉 주변에는 1998년 음악분수대가 설치되어, 도담삼봉과 석문을 찾는 관광객이 피로를 풀 수 있는 공간이 조성되어 있고 특히 야간에 분수대가 아름답다.\n",
            "국내에서 3번째로 큰 대청호 한복판, 아름다운 호수정원 위에 자리 잡고 있다.\n" + "수생식물을 재배하고 번식, 보급하는 관경농업의 현장으로 시작되었다. \n" + "수련농장, 수생식물 농장, 온대수련 연못, 매실나무 과수원, 잔디광장, 산책로 등이 조성되어 있으며 수련, 가시연, 연꽃, 부레옥잠화, 물양귀비, 파피루스 등 다양한 수생식물을 감상할 수 있다\n",
    };

    private MainModel[] dummyData = new MainModel[90];

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
        regionPanel = new RegionPanel();
        detailPanel = new DetailPanel();
        getContentPane().add(mainPanel);
        
        MenuBar menuBar = new MenuBar();
        this.setJMenuBar(menuBar);
        setVisible(true);
    }

    public void change(String str) {
        getContentPane().removeAll();
        if(str == "r")
        	getContentPane().add(regionPanel);
        else if(str == "d")
        	getContentPane().add(detailPanel);
        revalidate();
        repaint();
    }
}
