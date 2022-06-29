package experiment.test;

public class TestForEXP {

    public static void main(String[] args) {

        //序号-城市
        String[] city_num={
                "",
                "北京",
                "上海",
                "天津",   //3
                "重庆",
                "哈尔滨",
                "长春",   //6
                "沈阳",
                "呼和浩特",
                "石家庄",  //9
                "乌鲁木齐",
                "兰州",
                "西宁",   //12
                "西安",
                "银川",
                "郑州",   //15
                "济南",
                "太原",
                "合肥",   //18
                "长沙",
                "武汉",
                "南京",   //21
                "成都",
                "贵阳",
                "昆明",   //24
                "南宁",
                "拉萨",
                "杭州",   //27
                "南昌",
                "广州",
                "福州",   //30
                "台北",
                "海口"
        };

        /*航班信息
        例:
        CityMatrix[5][4]存储城市5(哈尔滨)到城市6(长春)的结点信息
        注:
        诸如CityMatrix[3][3]，出发点和结束点相同，值为null
        诸如CityMatrix[7][0]，下标含0，值为null
        诸如CityMatrix[0][9]，下标含0，值为null
        形如
            北京 上海 天津 ...
        北京
        上海
        天津
        ...
        */

        NodeCityMatrix[][] CityMatrix = new NodeCityMatrix[33][33];
        //1-北京
        CityMatrix[1][2] = new NodeCityMatrix(1, "北京", 2, "上海", 583.0, 125);
        CityMatrix[1][3] = new NodeCityMatrix(1, "北京", 3, "天津", 9999, 9999);
        CityMatrix[1][4] = new NodeCityMatrix(1, "北京", 4, "重庆", 500, 180);
        CityMatrix[1][5] = new NodeCityMatrix(1, "北京", 5, "哈尔滨", 1330, 120);
        CityMatrix[1][6] = new NodeCityMatrix(1, "北京", 6, "长春", 782, 125);
        CityMatrix[1][7] = new NodeCityMatrix(1, "北京", 7, "沈阳", 740, 95);
        CityMatrix[1][8] = new NodeCityMatrix(1, "北京", 8, "呼和浩特", 650, 80);
        CityMatrix[1][9] = new NodeCityMatrix(1, "北京", 9, "石家庄", 9999, 9999);
        CityMatrix[1][10] = new NodeCityMatrix(1, "北京", 10, "乌鲁木齐", 1571, 490);
        CityMatrix[1][11] = new NodeCityMatrix(1, "北京", 11, "兰州", 1340, 140);
        CityMatrix[1][12] = new NodeCityMatrix(1, "北京", 12, "西宁", 1797, 490);
        CityMatrix[1][13] = new NodeCityMatrix(1, "北京", 13, "西安", 745, 140);
        CityMatrix[1][14] = new NodeCityMatrix(1, "北京", 14, "银川", 1530, 130);
        CityMatrix[1][15] = new NodeCityMatrix(1, "北京", 15, "郑州", 810, 430);
        CityMatrix[1][16] = new NodeCityMatrix(1, "北京", 16, "济南", 750, 665);
        CityMatrix[1][17] = new NodeCityMatrix(1, "北京", 17, "太原", 645, 735);
        CityMatrix[1][18] = new NodeCityMatrix(1, "北京", 18, "合肥", 400, 125);
        CityMatrix[1][19] = new NodeCityMatrix(1, "北京", 19, "长沙", 788, 155);
        CityMatrix[1][20] = new NodeCityMatrix(1, "北京", 20, "武汉", 711, 510);
        CityMatrix[1][21] = new NodeCityMatrix(1, "北京", 21, "南京", 1065, 520);
        CityMatrix[1][22] = new NodeCityMatrix(1, "北京", 22, "成都", 541, 175);
        CityMatrix[1][23] = new NodeCityMatrix(1, "北京", 23, "贵阳", 1122, 340);
        CityMatrix[1][24] = new NodeCityMatrix(1, "北京", 24, "昆明", 1075, 290);
        CityMatrix[1][25] = new NodeCityMatrix(1, "北京", 25, "南宁", 1850, 225);
        CityMatrix[1][26] = new NodeCityMatrix(1, "北京", 26, "拉萨", 1130, 665);
        CityMatrix[1][27] = new NodeCityMatrix(1, "北京", 27, "杭州", 460, 130);
        CityMatrix[1][28] = new NodeCityMatrix(1, "北京", 28, "南昌", 600, 755);
        CityMatrix[1][29] = new NodeCityMatrix(1, "北京", 29, "广州", 473, 215);
        CityMatrix[1][30] = new NodeCityMatrix(1, "北京", 30, "福州", 2010, 185);
        CityMatrix[1][31] = new NodeCityMatrix(1, "北京", 31, "台北", 3004, 190);
        CityMatrix[1][32] = new NodeCityMatrix(1, "北京", 32, "海口", 660, 215);

        //2-上海
        CityMatrix[2][1] = new NodeCityMatrix(2, "上海", 1, "北京", 870, 145);
        CityMatrix[2][3] = new NodeCityMatrix(2, "上海", 3, "天津", 450, 135);
        CityMatrix[2][4] = new NodeCityMatrix(2, "上海", 4, "重庆", 430, 180);
        CityMatrix[2][5] = new NodeCityMatrix(2, "上海", 5, "哈尔滨", 1180, 190);
        CityMatrix[2][6] = new NodeCityMatrix(2, "上海", 6, "长春", 430, 170);
        CityMatrix[2][7] = new NodeCityMatrix(2, "上海", 7, "沈阳", 130, 155);
        CityMatrix[2][8] = new NodeCityMatrix(2, "上海", 8, "呼和浩特", 780, 165);
        CityMatrix[2][9] = new NodeCityMatrix(2, "上海", 9, "石家庄", 320, 140);
        CityMatrix[2][10] = new NodeCityMatrix(2, "上海", 10, "乌鲁木齐", 545, 100);
        CityMatrix[2][11] = new NodeCityMatrix(2, "上海", 11, "兰州", 1030, 190);
        CityMatrix[2][12] = new NodeCityMatrix(2, "上海", 12, "西宁", 820, 205);
        CityMatrix[2][13] = new NodeCityMatrix(2, "上海", 13, "西安", 260, 155);
        CityMatrix[2][14] = new NodeCityMatrix(2, "上海", 14, "银川", 300, 175);
        CityMatrix[2][15] = new NodeCityMatrix(2, "上海", 15, "郑州", 310, 125);
        CityMatrix[2][16] = new NodeCityMatrix(2, "上海", 16, "济南", 350, 110);
        CityMatrix[2][17] = new NodeCityMatrix(2, "上海", 17, "太原", 300, 140);
        CityMatrix[2][18] = new NodeCityMatrix(2, "上海", 18, "合肥", 449, 120);
        CityMatrix[2][19] = new NodeCityMatrix(2, "上海", 19, "长沙", 295, 120);
        CityMatrix[2][20] = new NodeCityMatrix(2, "上海", 20, "武汉", 720, 430);
        CityMatrix[2][21] = new NodeCityMatrix(2, "上海", 21, "南京", 9999, 9999);
        CityMatrix[2][22] = new NodeCityMatrix(2, "上海", 22, "成都", 500, 215);
        CityMatrix[2][23] = new NodeCityMatrix(2, "上海", 23, "贵阳", 530, 185);
        CityMatrix[2][24] = new NodeCityMatrix(2, "上海", 24, "昆明", 300, 205);
        CityMatrix[2][25] = new NodeCityMatrix(2, "上海", 25, "南宁", 340, 205);
        CityMatrix[2][26] = new NodeCityMatrix(2, "上海", 26, "拉萨", 790, 1125);
        CityMatrix[2][27] = new NodeCityMatrix(2, "上海", 27, "杭州", 9999, 9999);
        CityMatrix[2][28] = new NodeCityMatrix(2, "上海", 28, "南昌", 675, 95);
        CityMatrix[2][29] = new NodeCityMatrix(2, "上海", 29, "广州", 400, 150);
        CityMatrix[2][30] = new NodeCityMatrix(2, "上海", 30, "福州", 1020, 110);
        CityMatrix[2][31] = new NodeCityMatrix(2, "上海", 31, "台北", 2636, 125);
        CityMatrix[2][32] = new NodeCityMatrix(2, "上海", 32, "海口", 200, 195);

        //3-天津
        CityMatrix[3][1] = new NodeCityMatrix(3, "天津", 1, "北京", 9999, 9999);
        CityMatrix[3][2] = new NodeCityMatrix(3, "天津", 2, "上海", 250, 130);
        CityMatrix[3][4] = new NodeCityMatrix(3, "天津", 4, "重庆", 220, 165);
        CityMatrix[3][5] = new NodeCityMatrix(3, "天津", 5, "哈尔滨", 150, 130);
        CityMatrix[3][6] = new NodeCityMatrix(3, "天津", 6, "长春", 380, 105);
        CityMatrix[3][7] = new NodeCityMatrix(3, "天津", 7, "沈阳", 600, 380);
        CityMatrix[3][8] = new NodeCityMatrix(3, "天津", 8, "呼和浩特", 423, 85);
        CityMatrix[3][9] = new NodeCityMatrix(3, "天津", 9, "石家庄", 274, 945);
        CityMatrix[3][10] = new NodeCityMatrix(3, "天津", 10, "乌鲁木齐", 1500, 260);
        CityMatrix[3][11] = new NodeCityMatrix(3, "天津", 11, "兰州", 645, 210);
        CityMatrix[3][12] = new NodeCityMatrix(3, "天津", 12, "西宁", 2088, 380);
        CityMatrix[3][13] = new NodeCityMatrix(3, "天津", 13, "西安", 613, 130);
        CityMatrix[3][14] = new NodeCityMatrix(3, "天津", 14, "银川", 310, 125);
        CityMatrix[3][15] = new NodeCityMatrix(3, "天津", 15, "郑州", 1200, 415);
        CityMatrix[3][16] = new NodeCityMatrix(3, "天津", 16, "济南", 9999, 9999);
        CityMatrix[3][17] = new NodeCityMatrix(3, "天津", 17, "太原", 865, 500);
        CityMatrix[3][18] = new NodeCityMatrix(3, "天津", 18, "合肥", 365, 120);
        CityMatrix[3][19] = new NodeCityMatrix(3, "天津", 19, "长沙", 210, 175);
        CityMatrix[3][20] = new NodeCityMatrix(3, "天津", 20, "武汉", 245, 115);
        CityMatrix[3][21] = new NodeCityMatrix(3, "天津", 21, "南京", 340, 990);
        CityMatrix[3][22] = new NodeCityMatrix(3, "天津", 22, "成都", 300, 185);
        CityMatrix[3][23] = new NodeCityMatrix(3, "天津", 23, "贵阳", 690, 190);
        CityMatrix[3][24] = new NodeCityMatrix(3, "天津", 24, "昆明", 430, 215);
        CityMatrix[3][25] = new NodeCityMatrix(3, "天津", 25, "南宁", 770, 295);
        CityMatrix[3][26] = new NodeCityMatrix(3, "天津", 26, "拉萨", 850, 710);
        CityMatrix[3][27] = new NodeCityMatrix(3, "天津", 27, "杭州", 480, 115);
        CityMatrix[3][28] = new NodeCityMatrix(3, "天津", 28, "南昌", 545, 145);
        CityMatrix[3][29] = new NodeCityMatrix(3, "天津", 29, "广州", 209, 195);
        CityMatrix[3][30] = new NodeCityMatrix(3, "天津", 30, "福州", 615, 260);
        CityMatrix[3][31] = new NodeCityMatrix(3, "天津", 31, "台北", 1134, 690);
        CityMatrix[3][32] = new NodeCityMatrix(3, "天津", 32, "海口", 300, 225);

        //4-重庆
        CityMatrix[4][1] = new NodeCityMatrix(4, "重庆", 1, "北京", 950, 165);
        CityMatrix[4][2] = new NodeCityMatrix(4, "重庆", 2, "上海", 230, 150);
        CityMatrix[4][3] = new NodeCityMatrix(4, "重庆", 3, "天津", 420, 230);
        CityMatrix[4][5] = new NodeCityMatrix(4, "重庆", 5, "哈尔滨", 450, 345);
        CityMatrix[4][6] = new NodeCityMatrix(4, "重庆", 6, "长春", 400, 285);
        CityMatrix[4][7] = new NodeCityMatrix(4, "重庆", 7, "沈阳", 250, 285);
        CityMatrix[4][8] = new NodeCityMatrix(4, "重庆", 8, "呼和浩特", 500, 140);
        CityMatrix[4][9] = new NodeCityMatrix(4, "重庆", 9, "石家庄", 220, 130);
        CityMatrix[4][10] = new NodeCityMatrix(4, "重庆", 10, "乌鲁木齐", 500, 255);
        CityMatrix[4][11] = new NodeCityMatrix(4, "重庆", 11, "兰州", 440, 705);
        CityMatrix[4][12] = new NodeCityMatrix(4, "重庆", 12, "西宁", 364, 700);
        CityMatrix[4][13] = new NodeCityMatrix(4, "重庆", 13, "西安", 235, 95);
        CityMatrix[4][14] = new NodeCityMatrix(4, "重庆", 14, "银川", 190, 195);
        CityMatrix[4][15] = new NodeCityMatrix(4, "重庆", 15, "郑州", 350, 100);
        CityMatrix[4][16] = new NodeCityMatrix(4, "重庆", 16, "济南", 262, 135);
        CityMatrix[4][17] = new NodeCityMatrix(4, "重庆", 17, "太原", 260, 115);
        CityMatrix[4][18] = new NodeCityMatrix(4, "重庆", 18, "合肥", 120, 125);
        CityMatrix[4][19] = new NodeCityMatrix(4, "重庆", 19, "长沙", 200, 90);
        CityMatrix[4][20] = new NodeCityMatrix(4, "重庆", 20, "武汉", 300, 235);
        CityMatrix[4][21] = new NodeCityMatrix(4, "重庆", 21, "南京", 170, 140);
        CityMatrix[4][22] = new NodeCityMatrix(4, "重庆", 22, "成都", 9999, 9999);
        CityMatrix[4][23] = new NodeCityMatrix(4, "重庆", 23, "贵阳", 600, 230);
        CityMatrix[4][24] = new NodeCityMatrix(4, "重庆", 24, "昆明", 250, 100);
        CityMatrix[4][25] = new NodeCityMatrix(4, "重庆", 25, "南宁", 200, 115);
        CityMatrix[4][26] = new NodeCityMatrix(4, "重庆", 26, "拉萨", 674, 160);
        CityMatrix[4][27] = new NodeCityMatrix(4, "重庆", 27, "杭州", 222, 135);
        CityMatrix[4][28] = new NodeCityMatrix(4, "重庆", 28, "南昌", 280, 100);
        CityMatrix[4][29] = new NodeCityMatrix(4, "重庆", 29, "广州", 334, 115);
        CityMatrix[4][30] = new NodeCityMatrix(4, "重庆", 30, "福州", 300, 250);
        CityMatrix[4][31] = new NodeCityMatrix(4, "重庆", 31, "台北", 1174, 970);
        CityMatrix[4][32] = new NodeCityMatrix(4, "重庆", 32, "海口", 280, 125);

        //5-哈尔滨
        CityMatrix[5][1] = new NodeCityMatrix(5, "哈尔滨", 1, "北京", 1550, 135);
        CityMatrix[5][2] = new NodeCityMatrix(5, "哈尔滨", 2, "上海", 300, 335);
        CityMatrix[5][3] = new NodeCityMatrix(5, "哈尔滨", 3, "天津", 190, 145);
        CityMatrix[5][4] = new NodeCityMatrix(5, "哈尔滨", 4, "重庆", 400, 305);
        CityMatrix[5][6] = new NodeCityMatrix(5, "哈尔滨", 6, "长春", 9999, 9999);
        CityMatrix[5][7] = new NodeCityMatrix(5, "哈尔滨", 7, "沈阳", 283.5, 728);
        CityMatrix[5][8] = new NodeCityMatrix(5, "哈尔滨", 8, "呼和浩特", 626, 725);
        CityMatrix[5][9] = new NodeCityMatrix(5, "哈尔滨", 9, "石家庄", 147, 140);
        CityMatrix[5][10] = new NodeCityMatrix(5, "哈尔滨", 10, "乌鲁木齐", 500, 520);
        CityMatrix[5][11] = new NodeCityMatrix(5, "哈尔滨", 11, "兰州", 390, 425);
        CityMatrix[5][12] = new NodeCityMatrix(5, "哈尔滨", 12, "西宁", 580, 300);
        CityMatrix[5][13] = new NodeCityMatrix(5, "哈尔滨", 13, "西安", 358, 830);
        CityMatrix[5][14] = new NodeCityMatrix(5, "哈尔滨", 14, "银川", 148, 185);
        CityMatrix[5][15] = new NodeCityMatrix(5, "哈尔滨", 15, "郑州", 350, 190);
        CityMatrix[5][16] = new NodeCityMatrix(5, "哈尔滨", 16, "济南", 560, 160);
        CityMatrix[5][17] = new NodeCityMatrix(5, "哈尔滨", 17, "太原", 440, 440);
        CityMatrix[5][18] = new NodeCityMatrix(5, "哈尔滨", 18, "合肥", 390, 530);
        CityMatrix[5][19] = new NodeCityMatrix(5, "哈尔滨", 19, "长沙", 270, 350);
        CityMatrix[5][20] = new NodeCityMatrix(5, "哈尔滨", 20, "武汉", 720, 325);
        CityMatrix[5][21] = new NodeCityMatrix(5, "哈尔滨", 21, "南京", 520, 180);
        CityMatrix[5][22] = new NodeCityMatrix(5, "哈尔滨", 22, "成都", 550, 380);
        CityMatrix[5][23] = new NodeCityMatrix(5, "哈尔滨", 23, "贵阳", 477, 820);
        CityMatrix[5][24] = new NodeCityMatrix(5, "哈尔滨", 24, "昆明", 570, 545);
        CityMatrix[5][25] = new NodeCityMatrix(5, "哈尔滨", 25, "南宁", 590, 940);
        CityMatrix[5][26] = new NodeCityMatrix(5, "哈尔滨", 26, "拉萨", 1030, 835);
        CityMatrix[5][27] = new NodeCityMatrix(5, "哈尔滨", 27, "杭州", 300, 305);
        CityMatrix[5][28] = new NodeCityMatrix(5, "哈尔滨", 28, "南昌", 530, 240);
        CityMatrix[5][29] = new NodeCityMatrix(5, "哈尔滨", 29, "广州", 490, 730);
        CityMatrix[5][30] = new NodeCityMatrix(5, "哈尔滨", 30, "福州", 665, 370);
        CityMatrix[5][31] = new NodeCityMatrix(5, "哈尔滨", 31, "台北", 1694, 210);
        CityMatrix[5][32] = new NodeCityMatrix(5, "哈尔滨", 32, "海口", 510, 215);

        //6-长春
        CityMatrix[6][1] = new NodeCityMatrix(6, "长春", 1, "北京", 782, 145);
        CityMatrix[6][2] = new NodeCityMatrix(6, "长春", 2, "上海", 200, 165);
        CityMatrix[6][3] = new NodeCityMatrix(6, "长春", 3, "天津", 240, 115);
        CityMatrix[6][4] = new NodeCityMatrix(6, "长春", 4, "重庆", 370, 315);
        CityMatrix[6][5] = new NodeCityMatrix(6, "长春", 5, "哈尔滨", 9999, 9999);
        CityMatrix[6][7] = new NodeCityMatrix(6, "长春", 7, "沈阳", 410, 640);
        CityMatrix[6][8] = new NodeCityMatrix(6, "长春", 8, "呼和浩特", 370, 490);
        CityMatrix[6][9] = new NodeCityMatrix(6, "长春", 9, "石家庄", 283.5, 302);
        CityMatrix[6][10] = new NodeCityMatrix(6, "长春", 10, "乌鲁木齐", 550, 310);
        CityMatrix[6][11] = new NodeCityMatrix(6, "长春", 11, "兰州", 475, 175);
        CityMatrix[6][12] = new NodeCityMatrix(6, "长春", 12, "西宁", 527, 620);
        CityMatrix[6][13] = new NodeCityMatrix(6, "长春", 13, "西安", 421, 975);
        CityMatrix[6][14] = new NodeCityMatrix(6, "长春", 14, "银川", 430, 190);
        CityMatrix[6][15] = new NodeCityMatrix(6, "长春", 15, "郑州", 250, 175);
        CityMatrix[6][16] = new NodeCityMatrix(6, "长春", 16, "济南", 250, 120);
        CityMatrix[6][17] = new NodeCityMatrix(6, "长春", 17, "太原", 420, 745);
        CityMatrix[6][18] = new NodeCityMatrix(6, "长春", 18, "合肥", 337, 155);
        CityMatrix[6][19] = new NodeCityMatrix(6, "长春", 19, "长沙", 400, 210);
        CityMatrix[6][20] = new NodeCityMatrix(6, "长春", 20, "武汉", 500, 20);
        CityMatrix[6][21] = new NodeCityMatrix(6, "长春", 21, "南京", 390, 155);
        CityMatrix[6][22] = new NodeCityMatrix(6, "长春", 22, "成都", 429, 305);
        CityMatrix[6][23] = new NodeCityMatrix(6, "长春", 23, "贵阳", 430, 570);
        CityMatrix[6][24] = new NodeCityMatrix(6, "长春", 24, "昆明", 330, 405);
        CityMatrix[6][25] = new NodeCityMatrix(6, "长春", 25, "南宁", 1110, 380);
        CityMatrix[6][26] = new NodeCityMatrix(6, "长春", 26, "拉萨", 1000, 745);
        CityMatrix[6][27] = new NodeCityMatrix(6, "长春", 27, "杭州", 260, 285);
        CityMatrix[6][28] = new NodeCityMatrix(6, "长春", 28, "南昌", 220, 175);
        CityMatrix[6][29] = new NodeCityMatrix(6, "长春", 29, "广州", 270, 305);
        CityMatrix[6][30] = new NodeCityMatrix(6, "长春", 30, "福州", 880, 330);
        CityMatrix[6][31] = new NodeCityMatrix(6, "长春", 31, "台北", 1694, 940);
        CityMatrix[6][32] = new NodeCityMatrix(6, "长春", 32, "海口", 457, 370);


        //7-沈阳
        CityMatrix[7][1] = new NodeCityMatrix(7, "沈阳", 1, "北京", 1280, 100);
        CityMatrix[7][2] = new NodeCityMatrix(7, "沈阳", 2, "上海", 100, 155);
        CityMatrix[7][3] = new NodeCityMatrix(7, "沈阳", 3, "天津", 520, 175);
        CityMatrix[7][4] = new NodeCityMatrix(7, "沈阳", 4, "重庆", 210, 320);
        CityMatrix[7][5] = new NodeCityMatrix(7, "沈阳", 5, "哈尔滨", 470, 500);
        CityMatrix[7][6] = new NodeCityMatrix(7, "沈阳", 6, "长春", 370, 365);
        CityMatrix[7][8] = new NodeCityMatrix(7, "沈阳", 8, "呼和浩特", 200, 225);
        CityMatrix[7][9] = new NodeCityMatrix(7, "沈阳", 9, "石家庄", 280, 110);
        CityMatrix[7][10] = new NodeCityMatrix(7, "沈阳", 10, "乌鲁木齐", 1880, 400);
        CityMatrix[7][11] = new NodeCityMatrix(7, "沈阳", 11, "兰州", 740, 190);
        CityMatrix[7][12] = new NodeCityMatrix(7, "沈阳", 12, "西宁", 660, 470);
        CityMatrix[7][13] = new NodeCityMatrix(7, "沈阳", 13, "西安", 220, 265);
        CityMatrix[7][14] = new NodeCityMatrix(7, "沈阳", 14, "银川", 1341, 400);
        CityMatrix[7][15] = new NodeCityMatrix(7, "沈阳", 15, "郑州", 300, 160);
        CityMatrix[7][16] = new NodeCityMatrix(7, "沈阳", 16, "济南", 620, 105);
        CityMatrix[7][17] = new NodeCityMatrix(7, "沈阳", 17, "太原", 550, 105);
        CityMatrix[7][18] = new NodeCityMatrix(7, "沈阳", 18, "合肥", 553, 150);
        CityMatrix[7][19] = new NodeCityMatrix(7, "沈阳", 19, "长沙", 360, 200);
        CityMatrix[7][20] = new NodeCityMatrix(7, "沈阳", 20, "武汉", 569, 600);
        CityMatrix[7][21] = new NodeCityMatrix(7, "沈阳", 21, "南京", 200, 140);
        CityMatrix[7][22] = new NodeCityMatrix(7, "沈阳", 22, "成都", 400, 240);
        CityMatrix[7][23] = new NodeCityMatrix(7, "沈阳", 23, "贵阳", 700, 350);
        CityMatrix[7][24] = new NodeCityMatrix(7, "沈阳", 24, "昆明", 640, 260);
        CityMatrix[7][25] = new NodeCityMatrix(7, "沈阳", 25, "南宁", 647, 470);
        CityMatrix[7][26] = new NodeCityMatrix(7, "沈阳", 26, "拉萨", 1060, 580);
        CityMatrix[7][27] = new NodeCityMatrix(7, "沈阳", 27, "杭州", 400, 155);
        CityMatrix[7][28] = new NodeCityMatrix(7, "沈阳", 28, "南昌", 200, 175);
        CityMatrix[7][29] = new NodeCityMatrix(7, "沈阳", 29, "广州", 900, 250);
        CityMatrix[7][30] = new NodeCityMatrix(7, "沈阳", 30, "福州", 690, 210);
        CityMatrix[7][31] = new NodeCityMatrix(7, "沈阳", 31, "台北", 1554, 895);
        CityMatrix[7][32] = new NodeCityMatrix(7, "沈阳", 32, "海口", 480, 385);


        //8-呼和浩特
        CityMatrix[8][1] = new NodeCityMatrix(8, "呼和浩特", 1, "北京", 400, 75);
        CityMatrix[8][2] = new NodeCityMatrix(8, "呼和浩特", 2, "上海", 400, 160);
        CityMatrix[8][3] = new NodeCityMatrix(8, "呼和浩特", 3, "天津", 300, 85);
        CityMatrix[8][4] = new NodeCityMatrix(8, "呼和浩特", 4, "重庆", 300, 150);
        CityMatrix[8][5] = new NodeCityMatrix(8, "呼和浩特", 5, "哈尔滨", 499, 610);
        CityMatrix[8][6] = new NodeCityMatrix(8, "呼和浩特", 6, "长春", 530, 325);
        CityMatrix[8][7] = new NodeCityMatrix(8, "呼和浩特", 7, "沈阳", 218, 110);
        CityMatrix[8][9] = new NodeCityMatrix(8, "呼和浩特", 9, "石家庄", 130, 70);
        CityMatrix[8][10] = new NodeCityMatrix(8, "呼和浩特", 10, "乌鲁木齐", 880, 200);
        CityMatrix[8][11] = new NodeCityMatrix(8, "呼和浩特", 11, "兰州", 420, 105);
        CityMatrix[8][12] = new NodeCityMatrix(8, "呼和浩特", 12, "西宁", 440, 120);
        CityMatrix[8][13] = new NodeCityMatrix(8, "呼和浩特", 13, "西安", 288, 120);
        CityMatrix[8][14] = new NodeCityMatrix(8, "呼和浩特", 14, "银川", 9999, 9999);
        CityMatrix[8][15] = new NodeCityMatrix(8, "呼和浩特", 15, "郑州", 160, 95);
        CityMatrix[8][16] = new NodeCityMatrix(8, "呼和浩特", 16, "济南", 1040, 105);
        CityMatrix[8][17] = new NodeCityMatrix(8, "呼和浩特", 17, "太原", 307, 55);
        CityMatrix[8][18] = new NodeCityMatrix(8, "呼和浩特", 18, "合肥", 530, 115);
        CityMatrix[8][19] = new NodeCityMatrix(8, "呼和浩特", 19, "长沙", 920, 145);
        CityMatrix[8][20] = new NodeCityMatrix(8, "呼和浩特", 20, "武汉", 950, 500);
        CityMatrix[8][21] = new NodeCityMatrix(8, "呼和浩特", 21, "南京", 340, 135);
        CityMatrix[8][22] = new NodeCityMatrix(8, "呼和浩特", 22, "成都", 780, 155);
        CityMatrix[8][23] = new NodeCityMatrix(8, "呼和浩特", 23, "贵阳", 357, 155);
        CityMatrix[8][24] = new NodeCityMatrix(8, "呼和浩特", 24, "昆明", 425, 270);
        CityMatrix[8][25] = new NodeCityMatrix(8, "呼和浩特", 25, "南宁", 800, 530);
        CityMatrix[8][26] = new NodeCityMatrix(8, "呼和浩特", 26, "拉萨", 860, 570);
        CityMatrix[8][27] = new NodeCityMatrix(8, "呼和浩特", 27, "杭州", 560, 165);
        CityMatrix[8][28] = new NodeCityMatrix(8, "呼和浩特", 28, "南昌", 650, 140);
        CityMatrix[8][29] = new NodeCityMatrix(8, "呼和浩特", 29, "广州", 350, 195);
        CityMatrix[8][30] = new NodeCityMatrix(8, "呼和浩特", 30, "福州", 549, 415);
        CityMatrix[8][31] = new NodeCityMatrix(8, "呼和浩特", 31, "台北", 1554, 1000);
        CityMatrix[8][32] = new NodeCityMatrix(8, "呼和浩特", 32, "海口", 780, 220);


        //9-石家庄
        CityMatrix[9][1] = new NodeCityMatrix(9, "石家庄", 1, "北京", 9999, 9999);
        CityMatrix[9][2] = new NodeCityMatrix(9, "石家庄", 2, "上海", 200, 120);
        CityMatrix[9][3] = new NodeCityMatrix(9, "石家庄", 3, "天津", 554, 275);
        CityMatrix[9][4] = new NodeCityMatrix(9, "石家庄", 4, "重庆", 350, 150);
        CityMatrix[9][5] = new NodeCityMatrix(9, "石家庄", 5, "哈尔滨", 147, 125);
        CityMatrix[9][6] = new NodeCityMatrix(9, "石家庄", 6, "长春", 160, 130);
        CityMatrix[9][7] = new NodeCityMatrix(9, "石家庄", 7, "沈阳", 360, 100);
        CityMatrix[9][8] = new NodeCityMatrix(9, "石家庄", 8, "呼和浩特", 140, 75);
        CityMatrix[9][10] = new NodeCityMatrix(9, "石家庄", 10, "乌鲁木齐", 600, 260);
        CityMatrix[9][11] = new NodeCityMatrix(9, "石家庄", 11, "兰州", 442, 115);
        CityMatrix[9][12] = new NodeCityMatrix(9, "石家庄", 12, "西宁", 689, 300);
        CityMatrix[9][13] = new NodeCityMatrix(9, "石家庄", 13, "西安", 412, 100);
        CityMatrix[9][14] = new NodeCityMatrix(9, "石家庄", 14, "银川", 99, 100);
        CityMatrix[9][15] = new NodeCityMatrix(9, "石家庄", 15, "郑州", 299, 150);
        CityMatrix[9][16] = new NodeCityMatrix(9, "石家庄", 16, "济南", 9999, 9999);
        CityMatrix[9][17] = new NodeCityMatrix(9, "石家庄", 17, "太原", 80, 100);
        CityMatrix[9][18] = new NodeCityMatrix(9, "石家庄", 18, "合肥", 499, 370);
        CityMatrix[9][19] = new NodeCityMatrix(9, "石家庄", 19, "长沙", 733, 115);
        CityMatrix[9][20] = new NodeCityMatrix(9, "石家庄", 20, "武汉", 795, 430);
        CityMatrix[9][21] = new NodeCityMatrix(9, "石家庄", 21, "南京", 672, 400);
        CityMatrix[9][22] = new NodeCityMatrix(9, "石家庄", 22, "成都", 541, 625);
        CityMatrix[9][23] = new NodeCityMatrix(9, "石家庄", 23, "贵阳", 570, 165);
        CityMatrix[9][24] = new NodeCityMatrix(9, "石家庄", 24, "昆明", 400, 185);
        CityMatrix[9][25] = new NodeCityMatrix(9, "石家庄", 25, "南宁", 752, 190);
        CityMatrix[9][26] = new NodeCityMatrix(9, "石家庄", 26, "拉萨", 1072, 460);
        CityMatrix[9][27] = new NodeCityMatrix(9, "石家庄", 27, "杭州", 260, 115);
        CityMatrix[9][28] = new NodeCityMatrix(9, "石家庄", 28, "南昌", 260, 115);
        CityMatrix[9][29] = new NodeCityMatrix(9, "石家庄", 29, "广州", 370, 180);
        CityMatrix[9][30] = new NodeCityMatrix(9, "石家庄", 30, "福州", 340, 250);
        CityMatrix[9][31] = new NodeCityMatrix(9, "石家庄", 31, "台北", 9999, 9999);
        CityMatrix[9][32] = new NodeCityMatrix(9, "石家庄", 32, "海口", 952, 295);

        //10-乌鲁木齐
        CityMatrix[10][1] = new NodeCityMatrix(10, "乌鲁木齐", 1, "北京", 1120, 235);
        CityMatrix[10][2] = new NodeCityMatrix(10, "乌鲁木齐", 2, "上海", 300, 290);
        CityMatrix[10][3] = new NodeCityMatrix(10, "乌鲁木齐", 3, "天津", 354, 230);
        CityMatrix[10][4] = new NodeCityMatrix(10, "乌鲁木齐", 4, "重庆", 350, 235);
        CityMatrix[10][5] = new NodeCityMatrix(10, "乌鲁木齐", 5, "哈尔滨", 480, 100);
        CityMatrix[10][6] = new NodeCityMatrix(10, "乌鲁木齐", 6, "长春", 820, 520);
        CityMatrix[10][7] = new NodeCityMatrix(10, "乌鲁木齐", 7, "沈阳", 1590, 395);
        CityMatrix[10][8] = new NodeCityMatrix(10, "乌鲁木齐", 8, "呼和浩特", 770, 9999);
        CityMatrix[10][9] = new NodeCityMatrix(10, "乌鲁木齐", 9, "石家庄", 1571, 175);
        CityMatrix[10][11] = new NodeCityMatrix(10, "乌鲁木齐", 11, "兰州", 480, 180);
        CityMatrix[10][12] = new NodeCityMatrix(10, "乌鲁木齐", 12, "西宁", 810, 155);
        CityMatrix[10][13] = new NodeCityMatrix(10, "乌鲁木齐", 13, "西安", 290, 200);
        CityMatrix[10][14] = new NodeCityMatrix(10, "乌鲁木齐", 14, "银川", 160, 165);
        CityMatrix[10][15] = new NodeCityMatrix(10, "乌鲁木齐", 15, "郑州", 450, 250);
        CityMatrix[10][16] = new NodeCityMatrix(10, "乌鲁木齐", 16, "济南", 620, 250);
        CityMatrix[10][17] = new NodeCityMatrix(10, "乌鲁木齐", 17, "太原", 300, 190);
        CityMatrix[10][18] = new NodeCityMatrix(10, "乌鲁木齐", 18, "合肥", 395, 255);
        CityMatrix[10][19] = new NodeCityMatrix(10, "乌鲁木齐", 19, "长沙", 220, 260);
        CityMatrix[10][20] = new NodeCityMatrix(10, "乌鲁木齐", 20, "武汉", 680, 840);
        CityMatrix[10][21] = new NodeCityMatrix(10, "乌鲁木齐", 21, "南京", 1620, 350);
        CityMatrix[10][22] = new NodeCityMatrix(10, "乌鲁木齐", 22, "成都", 510, 215);
        CityMatrix[10][23] = new NodeCityMatrix(10, "乌鲁木齐", 23, "贵阳", 1090, 245);
        CityMatrix[10][24] = new NodeCityMatrix(10, "乌鲁木齐", 24, "昆明", 800, 400);
        CityMatrix[10][25] = new NodeCityMatrix(10, "乌鲁木齐", 25, "南宁", 880, 385);
        CityMatrix[10][26] = new NodeCityMatrix(10, "乌鲁木齐", 26, "拉萨", 2120, 365);
        CityMatrix[10][27] = new NodeCityMatrix(10, "乌鲁木齐", 27, "杭州", 570, 290);
        CityMatrix[10][28] = new NodeCityMatrix(10, "乌鲁木齐", 28, "南昌", 890, 390);
        CityMatrix[10][29] = new NodeCityMatrix(10, "乌鲁木齐", 29, "广州", 1300, 320);
        CityMatrix[10][30] = new NodeCityMatrix(10, "乌鲁木齐", 30, "福州", 500, 410);
        CityMatrix[10][31] = new NodeCityMatrix(10, "乌鲁木齐", 31, "台北", 2394, 1100);
        CityMatrix[10][32] = new NodeCityMatrix(10, "乌鲁木齐", 32, "海口", 1620, 405);

        //11-兰州
        CityMatrix[11][1] = new NodeCityMatrix(11, "兰州", 1, "北京", 400, 135);
        CityMatrix[11][2] = new NodeCityMatrix(11, "兰州", 2, "上海", 220, 180);
        CityMatrix[11][3] = new NodeCityMatrix(11, "兰州", 3, "天津", 400, 135);
        CityMatrix[11][4] = new NodeCityMatrix(11, "兰州", 4, "重庆", 732, 110);
        CityMatrix[11][5] = new NodeCityMatrix(11, "兰州", 5, "哈尔滨", 1400, 315);
        CityMatrix[11][6] = new NodeCityMatrix(11, "兰州", 6, "长春", 480, 200);
        CityMatrix[11][7] = new NodeCityMatrix(11, "兰州", 7, "沈阳", 300, 165);
        CityMatrix[11][8] = new NodeCityMatrix(11, "兰州", 8, "呼和浩特", 420, 100);
        CityMatrix[11][9] = new NodeCityMatrix(11, "兰州", 9, "石家庄", 300, 130);
        CityMatrix[11][10] = new NodeCityMatrix(11, "兰州", 10, "乌鲁木齐", 450, 175);
        CityMatrix[11][12] = new NodeCityMatrix(11, "兰州", 12, "西宁", 9999, 9999);
        CityMatrix[11][13] = new NodeCityMatrix(11, "兰州", 13, "西安", 574, 435);
        CityMatrix[11][14] = new NodeCityMatrix(11, "兰州", 14, "银川", 614, 60);
        CityMatrix[11][15] = new NodeCityMatrix(11, "兰州", 15, "郑州", 130, 115);
        CityMatrix[11][16] = new NodeCityMatrix(11, "兰州", 16, "济南", 480, 220);
        CityMatrix[11][17] = new NodeCityMatrix(11, "兰州", 17, "太原", 600, 580);
        CityMatrix[11][18] = new NodeCityMatrix(11, "兰州", 18, "合肥", 190, 125);
        CityMatrix[11][19] = new NodeCityMatrix(11, "兰州", 19, "长沙", 300, 150);
        CityMatrix[11][20] = new NodeCityMatrix(11, "兰州", 20, "武汉", 1020, 130);
        CityMatrix[11][21] = new NodeCityMatrix(11, "兰州", 21, "南京", 290, 150);
        CityMatrix[11][22] = new NodeCityMatrix(11, "兰州", 22, "成都", 380, 105);
        CityMatrix[11][23] = new NodeCityMatrix(11, "兰州", 23, "贵阳", 239, 120);
        CityMatrix[11][24] = new NodeCityMatrix(11, "兰州", 24, "昆明", 500, 275);
        CityMatrix[11][25] = new NodeCityMatrix(11, "兰州", 25, "南宁", 600, 160);
        CityMatrix[11][26] = new NodeCityMatrix(11, "兰州", 26, "拉萨", 1380, 475);
        CityMatrix[11][27] = new NodeCityMatrix(11, "兰州", 27, "杭州", 440, 175);
        CityMatrix[11][28] = new NodeCityMatrix(11, "兰州", 28, "南昌", 510, 140);
        CityMatrix[11][29] = new NodeCityMatrix(11, "兰州", 29, "广州", 200, 270);
        CityMatrix[11][30] = new NodeCityMatrix(11, "兰州", 30, "福州", 410, 290);
        CityMatrix[11][31] = new NodeCityMatrix(11, "兰州", 31, "台北", 1554, 935);
        CityMatrix[11][32] = new NodeCityMatrix(11, "兰州", 32, "海口", 715, 370);

        //12-西宁
        CityMatrix[12][1] = new NodeCityMatrix(12, "西宁", 1, "北京", 620, 135);
        CityMatrix[12][2] = new NodeCityMatrix(12, "西宁", 2, "上海", 300, 190);
        CityMatrix[12][3] = new NodeCityMatrix(12, "西宁", 3, "天津", 460, 145);
        CityMatrix[12][4] = new NodeCityMatrix(12, "西宁", 4, "重庆", 950, 115);
        CityMatrix[12][5] = new NodeCityMatrix(12, "西宁", 5, "哈尔滨", 645, 530);
        CityMatrix[12][6] = new NodeCityMatrix(12, "西宁", 6, "长春", 617, 535);
        CityMatrix[12][7] = new NodeCityMatrix(12, "西宁", 7, "沈阳", 500, 390);
        CityMatrix[12][8] = new NodeCityMatrix(12, "西宁", 8, "呼和浩特", 490, 115);
        CityMatrix[12][9] = new NodeCityMatrix(12, "西宁", 9, "石家庄", 780, 420);
        CityMatrix[12][10] = new NodeCityMatrix(12, "西宁", 10, "乌鲁木齐", 810, 155);
        CityMatrix[12][11] = new NodeCityMatrix(12, "西宁", 11, "兰州", 9999, 9999);
        CityMatrix[12][13] = new NodeCityMatrix(12, "西宁", 13, "西安", 200, 80);
        CityMatrix[12][14] = new NodeCityMatrix(12, "西宁", 14, "银川", 600, 65);
        CityMatrix[12][15] = new NodeCityMatrix(12, "西宁", 15, "郑州", 140, 115);
        CityMatrix[12][16] = new NodeCityMatrix(12, "西宁", 16, "济南", 900, 225);
        CityMatrix[12][17] = new NodeCityMatrix(12, "西宁", 17, "太原", 450, 100);
        CityMatrix[12][18] = new NodeCityMatrix(12, "西宁", 18, "合肥", 860, 385);
        CityMatrix[12][19] = new NodeCityMatrix(12, "西宁", 19, "长沙", 200, 165);
        CityMatrix[12][20] = new NodeCityMatrix(12, "西宁", 20, "武汉", 790, 400);
        CityMatrix[12][21] = new NodeCityMatrix(12, "西宁", 21, "南京", 600, 155);
        CityMatrix[12][22] = new NodeCityMatrix(12, "西宁", 22, "成都", 480, 105);
        CityMatrix[12][23] = new NodeCityMatrix(12, "西宁", 23, "贵阳", 480, 560);
        CityMatrix[12][24] = new NodeCityMatrix(12, "西宁", 24, "昆明", 400, 140);
        CityMatrix[12][25] = new NodeCityMatrix(12, "西宁", 25, "南宁", 930, 310);
        CityMatrix[12][26] = new NodeCityMatrix(12, "西宁", 26, "拉萨", 620, 130);
        CityMatrix[12][27] = new NodeCityMatrix(12, "西宁", 27, "杭州", 340, 280);
        CityMatrix[12][28] = new NodeCityMatrix(12, "西宁", 28, "南昌", 600, 335);
        CityMatrix[12][29] = new NodeCityMatrix(12, "西宁", 29, "广州", 1200, 175);
        CityMatrix[12][30] = new NodeCityMatrix(12, "西宁", 30, "福州", 600, 345);
        CityMatrix[12][31] = new NodeCityMatrix(12, "西宁", 31, "台北", 1614, 1335);
        CityMatrix[12][32] = new NodeCityMatrix(12, "西宁", 32, "海口", 720, 625);

        //13-西安
        CityMatrix[13][1] = new NodeCityMatrix(13, "西安", 1, "北京", 500, 135);
        CityMatrix[13][2] = new NodeCityMatrix(13, "西安", 2, "上海", 240, 135);
        CityMatrix[13][3] = new NodeCityMatrix(13, "西安", 3, "天津", 380, 115);
        CityMatrix[13][4] = new NodeCityMatrix(13, "西安", 4, "重庆", 355, 105);
        CityMatrix[13][5] = new NodeCityMatrix(13, "西安", 5, "哈尔滨", 420, 165);
        CityMatrix[13][6] = new NodeCityMatrix(13, "西安", 6, "长春", 610, 190);
        CityMatrix[13][7] = new NodeCityMatrix(13, "西安", 7, "沈阳", 280, 150);
        CityMatrix[13][8] = new NodeCityMatrix(13, "西安", 8, "呼和浩特", 690, 105);
        CityMatrix[13][9] = new NodeCityMatrix(13, "西安", 9, "石家庄", 440, 90);
        CityMatrix[13][10] = new NodeCityMatrix(13, "西安", 10, "乌鲁木齐", 539, 195);
        CityMatrix[13][11] = new NodeCityMatrix(13, "西安", 11, "兰州", 790, 345);
        CityMatrix[13][12] = new NodeCityMatrix(13, "西安", 12, "西宁", 170, 105);
        CityMatrix[13][14] = new NodeCityMatrix(13, "西安", 14, "银川", 655, 80);
        CityMatrix[13][15] = new NodeCityMatrix(13, "西安", 15, "郑州", 480, 510);
        CityMatrix[13][16] = new NodeCityMatrix(13, "西安", 16, "济南", 180, 110);
        CityMatrix[13][17] = new NodeCityMatrix(13, "西安", 17, "太原", 430, 565);
        CityMatrix[13][18] = new NodeCityMatrix(13, "西安", 18, "合肥", 215, 100);
        CityMatrix[13][19] = new NodeCityMatrix(13, "西安", 19, "长沙", 208, 110);
        CityMatrix[13][20] = new NodeCityMatrix(13, "西安", 20, "武汉", 610, 415);
        CityMatrix[13][21] = new NodeCityMatrix(13, "西安", 21, "南京", 190, 110);
        CityMatrix[13][22] = new NodeCityMatrix(13, "西安", 22, "成都", 228, 100);
        CityMatrix[13][23] = new NodeCityMatrix(13, "西安", 23, "贵阳", 174, 110);
        CityMatrix[13][24] = new NodeCityMatrix(13, "西安", 24, "昆明", 235, 140);
        CityMatrix[13][25] = new NodeCityMatrix(13, "西安", 25, "南宁", 590, 150);
        CityMatrix[13][26] = new NodeCityMatrix(13, "西安", 26, "拉萨", 680, 195);
        CityMatrix[13][27] = new NodeCityMatrix(13, "西安", 27, "杭州", 260, 155);
        CityMatrix[13][28] = new NodeCityMatrix(13, "西安", 28, "南昌", 370, 105);
        CityMatrix[13][29] = new NodeCityMatrix(13, "西安", 29, "广州", 209, 170);
        CityMatrix[13][30] = new NodeCityMatrix(13, "西安", 30, "福州", 250, 245);
        CityMatrix[13][31] = new NodeCityMatrix(13, "西安", 31, "台北", 1514, 820);
        CityMatrix[13][32] = new NodeCityMatrix(13, "西安", 32, "海口", 545, 180);


        //14-银川
        CityMatrix[14][1] = new NodeCityMatrix(14, "银川", 1, "北京", 830, 125);
        CityMatrix[14][2] = new NodeCityMatrix(14, "银川", 2, "上海", 300, 155);
        CityMatrix[14][3] = new NodeCityMatrix(14, "银川", 3, "天津", 300, 120);
        CityMatrix[14][4] = new NodeCityMatrix(14, "银川", 4, "重庆", 300, 125);
        CityMatrix[14][5] = new NodeCityMatrix(14, "银川", 5, "哈尔滨", 169, 180);
        CityMatrix[14][6] = new NodeCityMatrix(14, "银川", 6, "长春", 530, 185);
        CityMatrix[14][7] = new NodeCityMatrix(14, "银川", 7, "沈阳", 580, 330);
        CityMatrix[14][8] = new NodeCityMatrix(14, "银川", 8, "呼和浩特", 500, 80);
        CityMatrix[14][9] = new NodeCityMatrix(14, "银川", 9, "石家庄", 210, 85);
        CityMatrix[14][10] = new NodeCityMatrix(14, "银川", 10, "乌鲁木齐", 210, 200);
        CityMatrix[14][11] = new NodeCityMatrix(14, "银川", 11, "兰州", 614, 75);
        CityMatrix[14][12] = new NodeCityMatrix(14, "银川", 12, "西宁", 600, 70);
        CityMatrix[14][13] = new NodeCityMatrix(14, "银川", 13, "西安", 390, 75);
        CityMatrix[14][15] = new NodeCityMatrix(14, "银川", 15, "郑州", 657, 110);
        CityMatrix[14][16] = new NodeCityMatrix(14, "银川", 16, "济南", 830, 115);
        CityMatrix[14][17] = new NodeCityMatrix(14, "银川", 17, "太原", 470, 80);
        CityMatrix[14][18] = new NodeCityMatrix(14, "银川", 18, "合肥", 230, 130);
        CityMatrix[14][19] = new NodeCityMatrix(14, "银川", 19, "长沙", 1613, 95);
        CityMatrix[14][20] = new NodeCityMatrix(14, "银川", 20, "武汉", 630, 140);
        CityMatrix[14][21] = new NodeCityMatrix(14, "银川", 21, "南京", 669, 155);
        CityMatrix[14][22] = new NodeCityMatrix(14, "银川", 22, "成都", 515, 125);
        CityMatrix[14][23] = new NodeCityMatrix(14, "银川", 23, "贵阳", 840, 135);
        CityMatrix[14][24] = new NodeCityMatrix(14, "银川", 24, "昆明", 588, 165);
        CityMatrix[14][25] = new NodeCityMatrix(14, "银川", 25, "南宁", 440, 430);
        CityMatrix[14][26] = new NodeCityMatrix(14, "银川", 26, "拉萨", 1030, 380);
        CityMatrix[14][27] = new NodeCityMatrix(14, "银川", 27, "杭州", 425, 185);
        CityMatrix[14][28] = new NodeCityMatrix(14, "银川", 28, "南昌", 960, 250);
        CityMatrix[14][29] = new NodeCityMatrix(14, "银川", 29, "广州", 320, 195);
        CityMatrix[14][30] = new NodeCityMatrix(14, "银川", 30, "福州", 1785, 185);
        CityMatrix[14][31] = new NodeCityMatrix(14, "银川", 31, "台北", 1664, 1320);
        CityMatrix[14][32] = new NodeCityMatrix(14, "银川", 32, "海口", 900, 320);


        //15-郑州
        CityMatrix[15][1] = new NodeCityMatrix(15, "郑州", 1, "北京", 950, 100);
        CityMatrix[15][2] = new NodeCityMatrix(15, "郑州", 2, "上海", 320, 115);
        CityMatrix[15][3] = new NodeCityMatrix(15, "郑州", 3, "天津", 388, 95);
        CityMatrix[15][4] = new NodeCityMatrix(15, "郑州", 4, "重庆", 394, 120);
        CityMatrix[15][5] = new NodeCityMatrix(15, "郑州", 5, "哈尔滨", 300, 180);
        CityMatrix[15][6] = new NodeCityMatrix(15, "郑州", 6, "长春", 200, 175);
        CityMatrix[15][7] = new NodeCityMatrix(15, "郑州", 7, "沈阳", 210, 175);
        CityMatrix[15][8] = new NodeCityMatrix(15, "郑州", 8, "呼和浩特", 360, 100);
        CityMatrix[15][9] = new NodeCityMatrix(15, "郑州", 9, "石家庄", 880, 355);
        CityMatrix[15][10] = new NodeCityMatrix(15, "郑州", 10, "乌鲁木齐", 660, 265);
        CityMatrix[15][11] = new NodeCityMatrix(15, "郑州", 11, "兰州", 240, 130);
        CityMatrix[15][12] = new NodeCityMatrix(15, "郑州", 12, "西宁", 300, 140);
        CityMatrix[15][13] = new NodeCityMatrix(15, "郑州", 13, "西安", 700, 315);
        CityMatrix[15][14] = new NodeCityMatrix(15, "郑州", 14, "银川", 1018, 120);
        CityMatrix[15][16] = new NodeCityMatrix(15, "郑州", 16, "济南", 460, 360);
        CityMatrix[15][17] = new NodeCityMatrix(15, "郑州", 17, "太原", 660, 385);
        CityMatrix[15][18] = new NodeCityMatrix(15, "郑州", 18, "合肥", 600, 385);
        CityMatrix[15][19] = new NodeCityMatrix(15, "郑州", 19, "长沙", 500, 305);
        CityMatrix[15][20] = new NodeCityMatrix(15, "郑州", 20, "武汉", 9999, 9999);
        CityMatrix[15][21] = new NodeCityMatrix(15, "郑州", 21, "南京", 320, 90);
        CityMatrix[15][22] = new NodeCityMatrix(15, "郑州", 22, "成都", 490, 120);
        CityMatrix[15][23] = new NodeCityMatrix(15, "郑州", 23, "贵阳", 209, 140);
        CityMatrix[15][24] = new NodeCityMatrix(15, "郑州", 24, "昆明", 540, 170);
        CityMatrix[15][25] = new NodeCityMatrix(15, "郑州", 25, "南宁", 700, 170);
        CityMatrix[15][26] = new NodeCityMatrix(15, "郑州", 26, "拉萨", 800, 55);
        CityMatrix[15][27] = new NodeCityMatrix(15, "郑州", 27, "杭州", 260, 105);
        CityMatrix[15][28] = new NodeCityMatrix(15, "郑州", 28, "南昌", 940, 95);
        CityMatrix[15][29] = new NodeCityMatrix(15, "郑州", 29, "广州", 400, 135);
        CityMatrix[15][30] = new NodeCityMatrix(15, "郑州", 30, "福州", 270, 115);
        CityMatrix[15][31] = new NodeCityMatrix(15, "郑州", 31, "台北", 1414, 910);
        CityMatrix[15][32] = new NodeCityMatrix(15, "郑州", 32, "海口", 400, 170);

        //16-济南
        CityMatrix[16][1] = new NodeCityMatrix(16, "济南", 1, "北京", 805, 460);
        CityMatrix[16][2] = new NodeCityMatrix(16, "济南", 2, "上海", 350, 95);
        CityMatrix[16][3] = new NodeCityMatrix(16, "济南", 3, "天津", 270, 485);
        CityMatrix[16][4] = new NodeCityMatrix(16, "济南", 4, "重庆", 210, 145);
        CityMatrix[16][5] = new NodeCityMatrix(16, "济南", 5, "哈尔滨", 280, 130);
        CityMatrix[16][6] = new NodeCityMatrix(16, "济南", 6, "长春", 200, 115);
        CityMatrix[16][7] = new NodeCityMatrix(16, "济南", 7, "沈阳", 150, 100);
        CityMatrix[16][8] = new NodeCityMatrix(16, "济南", 8, "呼和浩特", 1040, 110);
        CityMatrix[16][9] = new NodeCityMatrix(16, "济南", 9, "石家庄", 9999, 9999);
        CityMatrix[16][10] = new NodeCityMatrix(16, "济南", 10, "乌鲁木齐", 670, 295);
        CityMatrix[16][11] = new NodeCityMatrix(16, "济南", 11, "兰州", 550, 145);
        CityMatrix[16][12] = new NodeCityMatrix(16, "济南", 12, "西宁", 500, 240);
        CityMatrix[16][13] = new NodeCityMatrix(16, "济南", 13, "西安", 210, 105);
        CityMatrix[16][14] = new NodeCityMatrix(16, "济南", 14, "银川", 1180, 125);
        CityMatrix[16][15] = new NodeCityMatrix(16, "济南", 15, "郑州", 310, 300);
        CityMatrix[16][17] = new NodeCityMatrix(16, "济南", 17, "太原", 400, 105);
        CityMatrix[16][18] = new NodeCityMatrix(16, "济南", 18, "合肥", 467, 490);
        CityMatrix[16][19] = new NodeCityMatrix(16, "济南", 19, "长沙", 200, 135);
        CityMatrix[16][20] = new NodeCityMatrix(16, "济南", 20, "武汉", 440, 110);
        CityMatrix[16][21] = new NodeCityMatrix(16, "济南", 21, "南京", 280, 350);
        CityMatrix[16][22] = new NodeCityMatrix(16, "济南", 22, "成都", 400, 150);
        CityMatrix[16][23] = new NodeCityMatrix(16, "济南", 23, "贵阳", 250, 165);
        CityMatrix[16][24] = new NodeCityMatrix(16, "济南", 24, "昆明", 305, 175);
        CityMatrix[16][25] = new NodeCityMatrix(16, "济南", 25, "南宁", 450, 180);
        CityMatrix[16][26] = new NodeCityMatrix(16, "济南", 26, "拉萨", 910, 450);
        CityMatrix[16][27] = new NodeCityMatrix(16, "济南", 27, "杭州", 350, 95);
        CityMatrix[16][28] = new NodeCityMatrix(16, "济南", 28, "南昌", 357, 110);
        CityMatrix[16][29] = new NodeCityMatrix(16, "济南", 29, "广州", 880, 180);
        CityMatrix[16][30] = new NodeCityMatrix(16, "济南", 30, "福州", 440, 135);
        CityMatrix[16][31] = new NodeCityMatrix(16, "济南", 31, "台北", 1424, 1380);
        CityMatrix[16][32] = new NodeCityMatrix(16, "济南", 32, "海口", 450, 300);

        //17-太原
        CityMatrix[17][1] = new NodeCityMatrix(17, "太原", 1, "北京", 630, 540);
        CityMatrix[17][2] = new NodeCityMatrix(17, "太原", 2, "上海", 550, 135);
        CityMatrix[17][3] = new NodeCityMatrix(17, "太原", 3, "天津", 300, 130);
        CityMatrix[17][4] = new NodeCityMatrix(17, "太原", 4, "重庆", 280, 125);
        CityMatrix[17][5] = new NodeCityMatrix(17, "太原", 5, "哈尔滨", 550, 450);
        CityMatrix[17][6] = new NodeCityMatrix(17, "太原", 6, "长春", 589, 495);
        CityMatrix[17][7] = new NodeCityMatrix(17, "太原", 7, "沈阳", 148, 110);
        CityMatrix[17][8] = new NodeCityMatrix(17, "太原", 8, "呼和浩特", 308, 120);
        CityMatrix[17][9] = new NodeCityMatrix(17, "太原", 9, "石家庄", 80, 75);
        CityMatrix[17][10] = new NodeCityMatrix(17, "太原", 10, "乌鲁木齐", 550, 240);
        CityMatrix[17][11] = new NodeCityMatrix(17, "太原", 11, "兰州", 390, 180);
        CityMatrix[17][12] = new NodeCityMatrix(17, "太原", 12, "西宁", 590, 115);
        CityMatrix[17][13] = new NodeCityMatrix(17, "太原", 13, "西安", 393, 525);
        CityMatrix[17][14] = new NodeCityMatrix(17, "太原", 14, "银川", 650, 310);
        CityMatrix[17][15] = new NodeCityMatrix(17, "太原", 15, "郑州", 549, 460);
        CityMatrix[17][16] = new NodeCityMatrix(17, "太原", 16, "济南", 700, 335);
        CityMatrix[17][18] = new NodeCityMatrix(17, "太原", 18, "合肥", 120, 100);
        CityMatrix[17][19] = new NodeCityMatrix(17, "太原", 19, "长沙", 260, 130);
        CityMatrix[17][20] = new NodeCityMatrix(17, "太原", 20, "武汉", 760, 320);
        CityMatrix[17][21] = new NodeCityMatrix(17, "太原", 21, "南京", 200, 115);
        CityMatrix[17][22] = new NodeCityMatrix(17, "太原", 22, "成都", 480, 145);
        CityMatrix[17][23] = new NodeCityMatrix(17, "太原", 23, "贵阳", 440, 150);
        CityMatrix[17][24] = new NodeCityMatrix(17, "太原", 24, "昆明", 450, 170);
        CityMatrix[17][25] = new NodeCityMatrix(17, "太原", 25, "南宁", 470, 290);
        CityMatrix[17][26] = new NodeCityMatrix(17, "太原", 26, "拉萨", 2700, 490);
        CityMatrix[17][27] = new NodeCityMatrix(17, "太原", 27, "杭州", 269, 135);
        CityMatrix[17][28] = new NodeCityMatrix(17, "太原", 28, "南昌", 400, 120);
        CityMatrix[17][29] = new NodeCityMatrix(17, "太原", 29, "广州", 440, 180);
        CityMatrix[17][30] = new NodeCityMatrix(17, "太原", 30, "福州", 510, 165);
        CityMatrix[17][31] = new NodeCityMatrix(17, "太原", 31, "台北", 1344, 1415);
        CityMatrix[17][32] = new NodeCityMatrix(17, "太原", 32, "海口", 600, 175);

        //18-合肥
        CityMatrix[18][1] = new NodeCityMatrix(18, "合肥", 1, "北京", 247, 115);
        CityMatrix[18][2] = new NodeCityMatrix(18, "合肥", 2, "上海", 370, 525);
        CityMatrix[18][3] = new NodeCityMatrix(18, "合肥", 3, "天津", 350, 340);
        CityMatrix[18][4] = new NodeCityMatrix(18, "合肥", 4, "重庆", 270, 125);
        CityMatrix[18][5] = new NodeCityMatrix(18, "合肥", 5, "哈尔滨", 280, 170);
        CityMatrix[18][6] = new NodeCityMatrix(18, "合肥", 6, "长春", 330, 155);
        CityMatrix[18][7] = new NodeCityMatrix(18, "合肥", 7, "沈阳", 429, 140);
        CityMatrix[18][8] = new NodeCityMatrix(18, "合肥", 8, "呼和浩特", 247, 115);
        CityMatrix[18][9] = new NodeCityMatrix(18, "合肥", 9, "石家庄", 290, 100);
        CityMatrix[18][10] = new NodeCityMatrix(18, "合肥", 10, "乌鲁木齐", 480, 290);
        CityMatrix[18][11] = new NodeCityMatrix(18, "合肥", 11, "兰州", 270, 145);
        CityMatrix[18][12] = new NodeCityMatrix(18, "合肥", 12, "西宁", 650, 155);
        CityMatrix[18][13] = new NodeCityMatrix(18, "合肥", 13, "西安", 350, 105);
        CityMatrix[18][14] = new NodeCityMatrix(18, "合肥", 14, "银川", 230, 140);
        CityMatrix[18][15] = new NodeCityMatrix(18, "合肥", 15, "郑州", 429, 340);
        CityMatrix[18][16] = new NodeCityMatrix(18, "合肥", 16, "济南", 379, 355);
        CityMatrix[18][17] = new NodeCityMatrix(18, "合肥", 17, "太原", 140, 95);
        CityMatrix[18][19] = new NodeCityMatrix(18, "合肥", 19, "长沙", 337, 130);
        CityMatrix[18][20] = new NodeCityMatrix(18, "合肥", 20, "武汉", 9999, 9999);
        CityMatrix[18][21] = new NodeCityMatrix(18, "合肥", 21, "南京", 9999, 9999);
        CityMatrix[18][22] = new NodeCityMatrix(18, "合肥", 22, "成都", 410, 160);
        CityMatrix[18][23] = new NodeCityMatrix(18, "合肥", 23, "贵阳", 199, 225);
        CityMatrix[18][24] = new NodeCityMatrix(18, "合肥", 24, "昆明", 270, 160);
        CityMatrix[18][25] = new NodeCityMatrix(18, "合肥", 25, "南宁", 440, 150);
        CityMatrix[18][26] = new NodeCityMatrix(18, "合肥", 26, "拉萨", 1405, 240);
        CityMatrix[18][27] = new NodeCityMatrix(18, "合肥", 27, "杭州", 9999, 9999);
        CityMatrix[18][28] = new NodeCityMatrix(18, "合肥", 28, "南昌", 610, 755);
        CityMatrix[18][29] = new NodeCityMatrix(18, "合肥", 29, "广州", 340, 120);
        CityMatrix[18][30] = new NodeCityMatrix(18, "合肥", 30, "福州", 710, 220);
        CityMatrix[18][31] = new NodeCityMatrix(18, "合肥", 31, "台北", 1064, 1215);
        CityMatrix[18][32] = new NodeCityMatrix(18, "合肥", 32, "海口", 447, 145);

        //19-长沙
        CityMatrix[19][1] = new NodeCityMatrix(19, "长沙", 1, "北京", 520, 75);
        CityMatrix[19][2] = new NodeCityMatrix(19, "长沙", 2, "上海", 170, 120);
        CityMatrix[19][3] = new NodeCityMatrix(19, "长沙", 3, "天津", 195, 130);
        CityMatrix[19][4] = new NodeCityMatrix(19, "长沙", 4, "重庆", 220, 195);
        CityMatrix[19][5] = new NodeCityMatrix(19, "长沙", 5, "哈尔滨", 450, 315);
        CityMatrix[19][6] = new NodeCityMatrix(19, "长沙", 6, "长春", 450, 290);
        CityMatrix[19][7] = new NodeCityMatrix(19, "长沙", 7, "沈阳", 600, 180);
        CityMatrix[19][8] = new NodeCityMatrix(19, "长沙", 8, "呼和浩特", 769, 145);
        CityMatrix[19][9] = new NodeCityMatrix(19, "长沙", 9, "石家庄", 425, 125);
        CityMatrix[19][10] = new NodeCityMatrix(19, "长沙", 10, "乌鲁木齐", 600, 280);
        CityMatrix[19][11] = new NodeCityMatrix(19, "长沙", 11, "兰州", 300, 150);
        CityMatrix[19][12] = new NodeCityMatrix(19, "长沙", 12, "西宁", 390, 160);
        CityMatrix[19][13] = new NodeCityMatrix(19, "长沙", 13, "西安", 230, 110);
        CityMatrix[19][14] = new NodeCityMatrix(19, "长沙", 14, "银川", 490, 150);
        CityMatrix[19][15] = new NodeCityMatrix(19, "长沙", 15, "郑州", 530, 380);
        CityMatrix[19][16] = new NodeCityMatrix(19, "长沙", 16, "济南", 260, 130);
        CityMatrix[19][17] = new NodeCityMatrix(19, "长沙", 17, "太原", 280, 125);
        CityMatrix[19][18] = new NodeCityMatrix(19, "长沙", 18, "合肥", 579, 355);
        CityMatrix[19][20] = new NodeCityMatrix(19, "长沙", 20, "武汉", 810, 485);
        CityMatrix[19][21] = new NodeCityMatrix(19, "长沙", 21, "南京", 240, 95);
        CityMatrix[19][22] = new NodeCityMatrix(19, "长沙", 22, "成都", 549, 125);
        CityMatrix[19][23] = new NodeCityMatrix(19, "长沙", 23, "贵阳", 530, 360);
        CityMatrix[19][24] = new NodeCityMatrix(19, "长沙", 24, "昆明", 280, 125);
        CityMatrix[19][25] = new NodeCityMatrix(19, "长沙", 25, "南宁", 480, 120);
        CityMatrix[19][26] = new NodeCityMatrix(19, "长沙", 26, "拉萨", 934, 525);
        CityMatrix[19][27] = new NodeCityMatrix(19, "长沙", 27, "杭州", 280, 100);
        CityMatrix[19][28] = new NodeCityMatrix(19, "长沙", 28, "南昌", 9999, 9999);
        CityMatrix[19][29] = new NodeCityMatrix(19, "长沙", 29, "广州", 520, 100);
        CityMatrix[19][30] = new NodeCityMatrix(19, "长沙", 30, "福州", 220, 90);
        CityMatrix[19][31] = new NodeCityMatrix(19, "长沙", 31, "台北", 1414, 740);
        CityMatrix[19][32] = new NodeCityMatrix(19, "长沙", 32, "海口", 507, 115);

        //20-武汉
        CityMatrix[20][1] = new NodeCityMatrix(20, "武汉", 1, "北京", 1030, 350);
        CityMatrix[20][2] = new NodeCityMatrix(20, "武汉", 2, "上海", 360, 90);
        CityMatrix[20][3] = new NodeCityMatrix(20, "武汉", 3, "天津", 400, 125);
        CityMatrix[20][4] = new NodeCityMatrix(20, "武汉", 4, "重庆", 370, 100);
        CityMatrix[20][5] = new NodeCityMatrix(20, "武汉", 5, "哈尔滨", 695, 335);
        CityMatrix[20][6] = new NodeCityMatrix(20, "武汉", 6, "长春", 740, 95);
        CityMatrix[20][7] = new NodeCityMatrix(20, "武汉", 7, "沈阳", 520, 435);
        CityMatrix[20][8] = new NodeCityMatrix(20, "武汉", 8, "呼和浩特", 390, 130);
        CityMatrix[20][9] = new NodeCityMatrix(20, "武汉", 9, "石家庄", 520, 795);
        CityMatrix[20][10] = new NodeCityMatrix(20, "武汉", 10, "乌鲁木齐", 810, 480);
        CityMatrix[20][11] = new NodeCityMatrix(20, "武汉", 11, "兰州", 449, 475);
        CityMatrix[20][12] = new NodeCityMatrix(20, "武汉", 12, "西宁", 810, 140);
        CityMatrix[20][13] = new NodeCityMatrix(20, "武汉", 13, "西安", 680, 95);
        CityMatrix[20][14] = new NodeCityMatrix(20, "武汉", 14, "银川", 520, 125);
        CityMatrix[20][15] = new NodeCityMatrix(20, "武汉", 15, "郑州", 9999, 9999);
        CityMatrix[20][16] = new NodeCityMatrix(20, "武汉", 16, "济南", 415, 95);
        CityMatrix[20][17] = new NodeCityMatrix(20, "武汉", 17, "太原", 990, 355);
        CityMatrix[20][18] = new NodeCityMatrix(20, "武汉", 18, "合肥", 9999, 9999);
        CityMatrix[20][19] = new NodeCityMatrix(20, "武汉", 19, "长沙", 580, 320);
        CityMatrix[20][21] = new NodeCityMatrix(20, "武汉", 21, "南京", 370, 360);
        CityMatrix[20][22] = new NodeCityMatrix(20, "武汉", 22, "成都", 180, 125);
        CityMatrix[20][23] = new NodeCityMatrix(20, "武汉", 23, "贵阳", 300, 185);
        CityMatrix[20][24] = new NodeCityMatrix(20, "武汉", 24, "昆明", 258, 140);
        CityMatrix[20][25] = new NodeCityMatrix(20, "武汉", 25, "南宁", 720, 380);
        CityMatrix[20][26] = new NodeCityMatrix(20, "武汉", 26, "拉萨", 920, 485);
        CityMatrix[20][27] = new NodeCityMatrix(20, "武汉", 27, "杭州", 450, 85);
        CityMatrix[20][28] = new NodeCityMatrix(20, "武汉", 28, "南昌", 9999, 9999);
        CityMatrix[20][29] = new NodeCityMatrix(20, "武汉", 29, "广州", 350, 115);
        CityMatrix[20][30] = new NodeCityMatrix(20, "武汉", 30, "福州", 730, 440);
        CityMatrix[20][31] = new NodeCityMatrix(20, "武汉", 31, "台北", 1364, 1340);
        CityMatrix[20][32] = new NodeCityMatrix(20, "武汉", 32, "海口", 610, 145);


        //21-南京
        CityMatrix[21][1] = new NodeCityMatrix(21, "南京", 1, "北京", 960, 120);
        CityMatrix[21][2] = new NodeCityMatrix(21, "南京", 2, "上海", 9999, 9999);
        CityMatrix[21][3] = new NodeCityMatrix(21, "南京", 3, "天津", 320, 630);
        CityMatrix[21][4] = new NodeCityMatrix(21, "南京", 4, "重庆", 270, 140);
        CityMatrix[21][5] = new NodeCityMatrix(21, "南京", 5, "哈尔滨", 350, 165);
        CityMatrix[21][6] = new NodeCityMatrix(21, "南京", 6, "长春", 230, 140);
        CityMatrix[21][7] = new NodeCityMatrix(21, "南京", 7, "沈阳", 180, 150);
        CityMatrix[21][8] = new NodeCityMatrix(21, "南京", 8, "呼和浩特", 300, 140);
        CityMatrix[21][9] = new NodeCityMatrix(21, "南京", 9, "石家庄", 290, 105);
        CityMatrix[21][10] = new NodeCityMatrix(21, "南京", 10, "乌鲁木齐", 500, 300);
        CityMatrix[21][11] = new NodeCityMatrix(21, "南京", 11, "兰州", 300, 160);
        CityMatrix[21][12] = new NodeCityMatrix(21, "南京", 12, "西宁", 550, 170);
        CityMatrix[21][13] = new NodeCityMatrix(21, "南京", 13, "西安", 238, 170);
        CityMatrix[21][14] = new NodeCityMatrix(21, "南京", 14, "银川", 340, 150);
        CityMatrix[21][15] = new NodeCityMatrix(21, "南京", 15, "郑州", 315, 95);
        CityMatrix[21][16] = new NodeCityMatrix(21, "南京", 16, "济南", 350, 320);
        CityMatrix[21][17] = new NodeCityMatrix(21, "南京", 17, "太原", 159, 115);
        CityMatrix[21][18] = new NodeCityMatrix(21, "南京", 18, "合肥", 9999, 9999);
        CityMatrix[21][19] = new NodeCityMatrix(21, "南京", 19, "长沙", 200, 105);
        CityMatrix[21][20] = new NodeCityMatrix(21, "南京", 20, "武汉", 610, 625);
        CityMatrix[21][22] = new NodeCityMatrix(21, "南京", 22, "成都", 650, 155);
        CityMatrix[21][23] = new NodeCityMatrix(21, "南京", 23, "贵阳", 179, 140);
        CityMatrix[21][24] = new NodeCityMatrix(21, "南京", 24, "昆明", 345, 175);
        CityMatrix[21][25] = new NodeCityMatrix(21, "南京", 25, "南宁", 400, 155);
        CityMatrix[21][26] = new NodeCityMatrix(21, "南京", 26, "拉萨", 884, 620);
        CityMatrix[21][27] = new NodeCityMatrix(21, "南京", 27, "杭州", 9999, 9999);
        CityMatrix[21][28] = new NodeCityMatrix(21, "南京", 28, "南昌", 380, 80);
        CityMatrix[21][29] = new NodeCityMatrix(21, "南京", 29, "广州", 230, 145);
        CityMatrix[21][30] = new NodeCityMatrix(21, "南京", 30, "福州", 230, 80);
        CityMatrix[21][31] = new NodeCityMatrix(21, "南京", 31, "台北", 1274, 1280);
        CityMatrix[21][32] = new NodeCityMatrix(21, "南京", 32, "海口", 360, 160);

        //22-成都
        CityMatrix[22][1] = new NodeCityMatrix(22, "成都", 1, "北京", 840, 185);
        CityMatrix[22][2] = new NodeCityMatrix(22, "成都", 2, "上海", 310, 190);
        CityMatrix[22][3] = new NodeCityMatrix(22, "成都", 3, "天津", 450, 145);
        CityMatrix[22][4] = new NodeCityMatrix(22, "成都", 4, "重庆", 9999, 9999);
        CityMatrix[22][5] = new NodeCityMatrix(22, "成都", 5, "哈尔滨", 1170, 220);
        CityMatrix[22][6] = new NodeCityMatrix(22, "成都", 6, "长春", 399, 330);
        CityMatrix[22][7] = new NodeCityMatrix(22, "成都", 7, "沈阳", 300, 190);
        CityMatrix[22][8] = new NodeCityMatrix(22, "成都", 8, "呼和浩特", 290, 145);
        CityMatrix[22][9] = new NodeCityMatrix(22, "成都", 9, "石家庄", 300, 140);
        CityMatrix[22][10] = new NodeCityMatrix(22, "成都", 10, "乌鲁木齐", 850, 210);
        CityMatrix[22][11] = new NodeCityMatrix(22, "成都", 11, "兰州", 269, 90);
        CityMatrix[22][12] = new NodeCityMatrix(22, "成都", 12, "西宁", 330, 105);
        CityMatrix[22][13] = new NodeCityMatrix(22, "成都", 13, "西安", 230, 95);
        CityMatrix[22][14] = new NodeCityMatrix(22, "成都", 14, "银川", 490, 105);
        CityMatrix[22][15] = new NodeCityMatrix(22, "成都", 15, "郑州", 430, 130);
        CityMatrix[22][16] = new NodeCityMatrix(22, "成都", 16, "济南", 407, 135);
        CityMatrix[22][17] = new NodeCityMatrix(22, "成都", 17, "太原", 350, 120);
        CityMatrix[22][18] = new NodeCityMatrix(22, "成都", 18, "合肥", 300, 125);
        CityMatrix[22][19] = new NodeCityMatrix(22, "成都", 19, "长沙", 278, 110);
        CityMatrix[22][20] = new NodeCityMatrix(22, "成都", 20, "武汉", 160, 130);
        CityMatrix[22][21] = new NodeCityMatrix(22, "成都", 21, "南京", 439, 140);
        CityMatrix[22][23] = new NodeCityMatrix(22, "成都", 23, "贵阳", 219, 80);
        CityMatrix[22][24] = new NodeCityMatrix(22, "成都", 24, "昆明", 335, 90);
        CityMatrix[22][25] = new NodeCityMatrix(22, "成都", 25, "南宁", 269, 115);
        CityMatrix[22][26] = new NodeCityMatrix(22, "成都", 26, "拉萨", 1000, 140);
        CityMatrix[22][27] = new NodeCityMatrix(22, "成都", 27, "杭州", 320, 155);
        CityMatrix[22][28] = new NodeCityMatrix(22, "成都", 28, "南昌", 610, 145);
        CityMatrix[22][29] = new NodeCityMatrix(22, "成都", 29, "广州", 299, 145);
        CityMatrix[22][30] = new NodeCityMatrix(22, "成都", 30, "福州", 350, 155);
        CityMatrix[22][31] = new NodeCityMatrix(22, "成都", 31, "台北", 1134, 1150);
        CityMatrix[22][32] = new NodeCityMatrix(22, "成都", 32, "海口", 380, 140);

        //23-贵阳
        CityMatrix[23][1] = new NodeCityMatrix(23, "贵阳", 1, "北京", 772, 170);
        CityMatrix[23][2] = new NodeCityMatrix(23, "贵阳", 2, "上海", 400, 145);
        CityMatrix[23][3] = new NodeCityMatrix(23, "贵阳", 3, "天津", 590, 180);
        CityMatrix[23][4] = new NodeCityMatrix(23, "贵阳", 4, "重庆", 729, 340);
        CityMatrix[23][5] = new NodeCityMatrix(23, "贵阳", 5, "哈尔滨", 1470, 390);
        CityMatrix[23][6] = new NodeCityMatrix(23, "贵阳", 6, "长春", 680, 320);
        CityMatrix[23][7] = new NodeCityMatrix(23, "贵阳", 7, "沈阳", 1080, 295);
        CityMatrix[23][8] = new NodeCityMatrix(23, "贵阳", 8, "呼和浩特", 357, 160);
        CityMatrix[23][9] = new NodeCityMatrix(23, "贵阳", 9, "石家庄", 570, 160);
        CityMatrix[23][10] = new NodeCityMatrix(23, "贵阳", 10, "乌鲁木齐", 960, 250);
        CityMatrix[23][11] = new NodeCityMatrix(23, "贵阳", 11, "兰州", 320, 125);
        CityMatrix[23][12] = new NodeCityMatrix(23, "贵阳", 12, "西宁", 500, 140);
        CityMatrix[23][13] = new NodeCityMatrix(23, "贵阳", 13, "西安", 240, 110);
        CityMatrix[23][14] = new NodeCityMatrix(23, "贵阳", 14, "银川", 560, 135);
        CityMatrix[23][15] = new NodeCityMatrix(23, "贵阳", 15, "郑州", 210, 125);
        CityMatrix[23][16] = new NodeCityMatrix(23, "贵阳", 16, "济南", 320, 155);
        CityMatrix[23][17] = new NodeCityMatrix(23, "贵阳", 17, "太原", 426, 130);
        CityMatrix[23][18] = new NodeCityMatrix(23, "贵阳", 18, "合肥", 240, 125);
        CityMatrix[23][19] = new NodeCityMatrix(23, "贵阳", 19, "长沙", 657, 650);
        CityMatrix[23][20] = new NodeCityMatrix(23, "贵阳", 20, "武汉", 300, 200);
        CityMatrix[23][21] = new NodeCityMatrix(23, "贵阳", 21, "南京", 277, 125);
        CityMatrix[23][22] = new NodeCityMatrix(23, "贵阳", 22, "成都", 299, 75);
        CityMatrix[23][24] = new NodeCityMatrix(23, "贵阳", 24, "昆明", 570, 310);
        CityMatrix[23][25] = new NodeCityMatrix(23, "贵阳", 25, "南宁", 280, 80);
        CityMatrix[23][26] = new NodeCityMatrix(23, "贵阳", 26, "拉萨", 1349, 605);
        CityMatrix[23][27] = new NodeCityMatrix(23, "贵阳", 27, "杭州", 340, 80);
        CityMatrix[23][28] = new NodeCityMatrix(23, "贵阳", 28, "南昌", 478, 105);
        CityMatrix[23][29] = new NodeCityMatrix(23, "贵阳", 29, "广州", 269, 100);
        CityMatrix[23][30] = new NodeCityMatrix(23, "贵阳", 30, "福州", 390, 140);
        CityMatrix[23][31] = new NodeCityMatrix(23, "贵阳", 31, "台北", 1204, 1000);
        CityMatrix[23][32] = new NodeCityMatrix(23, "贵阳", 32, "海口", 339, 100);

        //24-昆明
        CityMatrix[24][1] = new NodeCityMatrix(24, "昆明", 1, "北京", 1150, 205);
        CityMatrix[24][2] = new NodeCityMatrix(24, "昆明", 2, "上海", 306, 205);
        CityMatrix[24][3] = new NodeCityMatrix(24, "昆明", 3, "天津", 500, 185);
        CityMatrix[24][4] = new NodeCityMatrix(24, "昆明", 4, "重庆", 210, 100);
        CityMatrix[24][5] = new NodeCityMatrix(24, "昆明", 5, "哈尔滨", 2090, 380);
        CityMatrix[24][6] = new NodeCityMatrix(24, "昆明", 6, "长春", 318, 320);
        CityMatrix[24][7] = new NodeCityMatrix(24, "昆明", 7, "沈阳", 480, 235);
        CityMatrix[24][8] = new NodeCityMatrix(24, "昆明", 8, "呼和浩特", 633, 285);
        CityMatrix[24][9] = new NodeCityMatrix(24, "昆明", 9, "石家庄", 360, 185);
        CityMatrix[24][10] = new NodeCityMatrix(24, "昆明", 10, "乌鲁木齐", 605, 280);
        CityMatrix[24][11] = new NodeCityMatrix(24, "昆明", 11, "兰州", 550, 140);
        CityMatrix[24][12] = new NodeCityMatrix(24, "昆明", 12, "西宁", 780, 145);
        CityMatrix[24][13] = new NodeCityMatrix(24, "昆明", 13, "西安", 276, 140);
        CityMatrix[24][14] = new NodeCityMatrix(24, "昆明", 14, "银川", 350, 165);
        CityMatrix[24][15] = new NodeCityMatrix(24, "昆明", 15, "郑州", 210, 180);
        CityMatrix[24][16] = new NodeCityMatrix(24, "昆明", 16, "济南", 256, 185);
        CityMatrix[24][17] = new NodeCityMatrix(24, "昆明", 17, "太原", 427, 165);
        CityMatrix[24][18] = new NodeCityMatrix(24, "昆明", 18, "合肥", 287, 140);
        CityMatrix[24][19] = new NodeCityMatrix(24, "昆明", 19, "长沙", 275, 130);
        CityMatrix[24][20] = new NodeCityMatrix(24, "昆明", 20, "武汉", 210, 130);
        CityMatrix[24][21] = new NodeCityMatrix(24, "昆明", 21, "南京", 350, 175);
        CityMatrix[24][22] = new NodeCityMatrix(24, "昆明", 22, "成都", 300, 90);
        CityMatrix[24][23] = new NodeCityMatrix(24, "昆明", 23, "贵阳", 680, 425);
        CityMatrix[24][25] = new NodeCityMatrix(24, "昆明", 25, "南宁", 250, 95);
        CityMatrix[24][26] = new NodeCityMatrix(24, "昆明", 26, "拉萨", 1160, 260);
        CityMatrix[24][27] = new NodeCityMatrix(24, "昆明", 27, "杭州", 297, 165);
        CityMatrix[24][28] = new NodeCityMatrix(24, "昆明", 28, "南昌", 350, 135);
        CityMatrix[24][29] = new NodeCityMatrix(24, "昆明", 29, "广州", 537, 130);
        CityMatrix[24][30] = new NodeCityMatrix(24, "昆明", 30, "福州", 407, 160);
        CityMatrix[24][31] = new NodeCityMatrix(24, "昆明", 31, "台北", 1324, 1130);
        CityMatrix[24][32] = new NodeCityMatrix(24, "昆明", 32, "海口", 317, 110);

        //25-南宁
        CityMatrix[25][1] = new NodeCityMatrix(25, "南宁", 1, "北京", 750, 215);
        CityMatrix[25][2] = new NodeCityMatrix(25, "南宁", 2, "上海", 210, 165);
        CityMatrix[25][3] = new NodeCityMatrix(25, "南宁", 3, "天津", 680, 290);
        CityMatrix[25][4] = new NodeCityMatrix(25, "南宁", 4, "重庆", 230, 95);
        CityMatrix[25][5] = new NodeCityMatrix(25, "南宁", 5, "哈尔滨", 520, 300);
        CityMatrix[25][6] = new NodeCityMatrix(25, "南宁", 6, "长春", 1000, 305);
        CityMatrix[25][7] = new NodeCityMatrix(25, "南宁", 7, "沈阳", 470, 315);
        CityMatrix[25][8] = new NodeCityMatrix(25, "南宁", 8, "呼和浩特", 640, 290);
        CityMatrix[25][9] = new NodeCityMatrix(25, "南宁", 9, "石家庄", 580, 180);
        CityMatrix[25][10] = new NodeCityMatrix(25, "南宁", 10, "乌鲁木齐", 1200, 410);
        CityMatrix[25][11] = new NodeCityMatrix(25, "南宁", 11, "兰州", 360, 490);
        CityMatrix[25][12] = new NodeCityMatrix(25, "南宁", 12, "西宁", 745, 155);
        CityMatrix[25][13] = new NodeCityMatrix(25, "南宁", 13, "西安", 420, 135);
        CityMatrix[25][14] = new NodeCityMatrix(25, "南宁", 14, "银川", 390, 170);
        CityMatrix[25][15] = new NodeCityMatrix(25, "南宁", 15, "郑州", 250, 165);
        CityMatrix[25][16] = new NodeCityMatrix(25, "南宁", 16, "济南", 450, 180);
        CityMatrix[25][17] = new NodeCityMatrix(25, "南宁", 17, "太原", 580, 175);
        CityMatrix[25][18] = new NodeCityMatrix(25, "南宁", 18, "合肥", 490, 135);
        CityMatrix[25][19] = new NodeCityMatrix(25, "南宁", 19, "长沙", 320, 105);
        CityMatrix[25][20] = new NodeCityMatrix(25, "南宁", 20, "武汉", 670, 345);
        CityMatrix[25][21] = new NodeCityMatrix(25, "南宁", 21, "南京", 600, 140);
        CityMatrix[25][22] = new NodeCityMatrix(25, "南宁", 22, "成都", 270, 110);
        CityMatrix[25][23] = new NodeCityMatrix(25, "南宁", 23, "贵阳", 330, 80);
        CityMatrix[25][24] = new NodeCityMatrix(25, "南宁", 24, "昆明", 215, 105);
        CityMatrix[25][26] = new NodeCityMatrix(25, "南宁", 26, "拉萨", 780, 210);
        CityMatrix[25][27] = new NodeCityMatrix(25, "南宁", 27, "杭州", 250, 145);
        CityMatrix[25][28] = new NodeCityMatrix(25, "南宁", 28, "南昌", 454, 125);
        CityMatrix[25][29] = new NodeCityMatrix(25, "南宁", 29, "广州", 540, 350);
        CityMatrix[25][30] = new NodeCityMatrix(25, "南宁", 30, "福州", 260, 125);
        CityMatrix[25][31] = new NodeCityMatrix(25, "南宁", 31, "台北", 1274, 1420);
        CityMatrix[25][32] = new NodeCityMatrix(25, "南宁", 32, "海口", 150, 65);

        //26-拉萨
        CityMatrix[26][1] = new NodeCityMatrix(26, "拉萨", 1, "北京", 960, 515);
        CityMatrix[26][2] = new NodeCityMatrix(26, "拉萨", 2, "上海", 1322, 305);
        CityMatrix[26][3] = new NodeCityMatrix(26, "拉萨", 3, "天津", 660, 500);
        CityMatrix[26][4] = new NodeCityMatrix(26, "拉萨", 4, "重庆", 350, 150);
        CityMatrix[26][5] = new NodeCityMatrix(26, "拉萨", 5, "哈尔滨", 940, 565);
        CityMatrix[26][6] = new NodeCityMatrix(26, "拉萨", 6, "长春", 1000, 450);
        CityMatrix[26][7] = new NodeCityMatrix(26, "拉萨", 7, "沈阳", 730, 540);
        CityMatrix[26][8] = new NodeCityMatrix(26, "拉萨", 8, "呼和浩特", 680, 430);
        CityMatrix[26][9] = new NodeCityMatrix(26, "拉萨", 9, "石家庄", 661, 490);
        CityMatrix[26][10] = new NodeCityMatrix(26, "拉萨", 10, "乌鲁木齐", 1060, 440);
        CityMatrix[26][11] = new NodeCityMatrix(26, "拉萨", 11, "兰州", 670, 470);
        CityMatrix[26][12] = new NodeCityMatrix(26, "拉萨", 12, "西宁", 745, 140);
        CityMatrix[26][13] = new NodeCityMatrix(26, "拉萨", 13, "西安", 480, 130);
        CityMatrix[26][14] = new NodeCityMatrix(26, "拉萨", 14, "银川", 780, 515);
        CityMatrix[26][15] = new NodeCityMatrix(26, "拉萨", 15, "郑州", 940, 300);
        CityMatrix[26][16] = new NodeCityMatrix(26, "拉萨", 16, "济南", 700, 535);
        CityMatrix[26][17] = new NodeCityMatrix(26, "拉萨", 17, "太原", 710, 475);
        CityMatrix[26][18] = new NodeCityMatrix(26, "拉萨", 18, "合肥", 1420, 235);
        CityMatrix[26][19] = new NodeCityMatrix(26, "拉萨", 19, "长沙", 690, 370);
        CityMatrix[26][20] = new NodeCityMatrix(26, "拉萨", 20, "武汉", 640, 505);
        CityMatrix[26][21] = new NodeCityMatrix(26, "拉萨", 21, "南京", 600, 440);
        CityMatrix[26][22] = new NodeCityMatrix(26, "拉萨", 22, "成都", 380, 125);
        CityMatrix[26][23] = new NodeCityMatrix(26, "拉萨", 23, "贵阳", 990, 335);
        CityMatrix[26][24] = new NodeCityMatrix(26, "拉萨", 24, "昆明", 1200, 255);
        CityMatrix[26][25] = new NodeCityMatrix(26, "拉萨", 25, "南宁", 780, 220);
        CityMatrix[26][27] = new NodeCityMatrix(26, "拉萨", 27, "杭州", 2040, 340);
        CityMatrix[26][28] = new NodeCityMatrix(26, "拉萨", 28, "南昌", 690, 355);
        CityMatrix[26][29] = new NodeCityMatrix(26, "拉萨", 29, "广州", 2610, 340);
        CityMatrix[26][30] = new NodeCityMatrix(26, "拉萨", 30, "福州", 710, 435);
        CityMatrix[26][31] = new NodeCityMatrix(26, "拉萨", 31, "台北", 9999, 9999);
        CityMatrix[26][32] = new NodeCityMatrix(26, "拉萨", 32, "海口", 810, 390);


        //27-杭州
        CityMatrix[27][1] = new NodeCityMatrix(27, "杭州", 1, "北京", 350, 145);
        CityMatrix[27][2] = new NodeCityMatrix(27, "杭州", 2, "上海", 9999, 9999);
        CityMatrix[27][3] = new NodeCityMatrix(27, "杭州", 3, "天津", 250, 125);
        CityMatrix[27][4] = new NodeCityMatrix(27, "杭州", 4, "重庆", 195, 155);
        CityMatrix[27][5] = new NodeCityMatrix(27, "杭州", 5, "哈尔滨", 300, 185);
        CityMatrix[27][6] = new NodeCityMatrix(27, "杭州", 6, "长春", 200, 175);
        CityMatrix[27][7] = new NodeCityMatrix(27, "杭州", 7, "沈阳", 200, 165);
        CityMatrix[27][8] = new NodeCityMatrix(27, "杭州", 8, "呼和浩特", 640, 150);
        CityMatrix[27][9] = new NodeCityMatrix(27, "杭州", 9, "石家庄", 150, 130);
        CityMatrix[27][10] = new NodeCityMatrix(27, "杭州", 10, "乌鲁木齐", 490, 315);
        CityMatrix[27][11] = new NodeCityMatrix(27, "杭州", 11, "兰州", 440, 180);
        CityMatrix[27][12] = new NodeCityMatrix(27, "杭州", 12, "西宁", 440, 200);
        CityMatrix[27][13] = new NodeCityMatrix(27, "杭州", 13, "西安", 180, 140);
        CityMatrix[27][14] = new NodeCityMatrix(27, "杭州", 14, "银川", 300, 180);
        CityMatrix[27][15] = new NodeCityMatrix(27, "杭州", 15, "郑州", 228, 110);
        CityMatrix[27][16] = new NodeCityMatrix(27, "杭州", 16, "济南", 350, 100);
        CityMatrix[27][17] = new NodeCityMatrix(27, "杭州", 17, "太原", 190, 150);
        CityMatrix[27][18] = new NodeCityMatrix(27, "杭州", 18, "合肥", 9999, 9999);
        CityMatrix[27][19] = new NodeCityMatrix(27, "杭州", 19, "长沙", 310, 110);
        CityMatrix[27][20] = new NodeCityMatrix(27, "杭州", 20, "武汉", 330, 105);
        CityMatrix[27][21] = new NodeCityMatrix(27, "杭州", 21, "南京", 9999, 9999);
        CityMatrix[27][22] = new NodeCityMatrix(27, "杭州", 22, "成都", 299, 195);
        CityMatrix[27][23] = new NodeCityMatrix(27, "杭州", 23, "贵阳", 320, 155);
        CityMatrix[27][24] = new NodeCityMatrix(27, "杭州", 24, "昆明", 280, 180);
        CityMatrix[27][25] = new NodeCityMatrix(27, "杭州", 25, "南宁", 230, 160);
        CityMatrix[27][26] = new NodeCityMatrix(27, "杭州", 26, "拉萨", 2140, 400);
        CityMatrix[27][28] = new NodeCityMatrix(27, "杭州", 28, "南昌", 9999, 9999);
        CityMatrix[27][29] = new NodeCityMatrix(27, "杭州", 29, "广州", 180, 125);
        CityMatrix[27][30] = new NodeCityMatrix(27, "杭州", 30, "福州", 630, 340);
        CityMatrix[27][31] = new NodeCityMatrix(27, "杭州", 31, "台北", 1274, 680);
        CityMatrix[27][32] = new NodeCityMatrix(27, "杭州", 32, "海口", 147, 170);

        //28-南昌
        CityMatrix[28][1] = new NodeCityMatrix(28, "南昌", 1, "北京", 430, 135);
        CityMatrix[28][2] = new NodeCityMatrix(28, "南昌", 2, "上海", 440, 155);
        CityMatrix[28][3] = new NodeCityMatrix(28, "南昌", 3, "天津", 320, 150);
        CityMatrix[28][4] = new NodeCityMatrix(28, "南昌", 4, "重庆", 150, 125);
        CityMatrix[28][5] = new NodeCityMatrix(28, "南昌", 5, "哈尔滨", 843, 505);
        CityMatrix[28][6] = new NodeCityMatrix(28, "南昌", 6, "长春", 220, 170);
        CityMatrix[28][7] = new NodeCityMatrix(28, "南昌", 7, "沈阳", 210, 180);
        CityMatrix[28][8] = new NodeCityMatrix(28, "南昌", 8, "呼和浩特", 882, 145);
        CityMatrix[28][9] = new NodeCityMatrix(28, "南昌", 9, "石家庄", 200, 130);
        CityMatrix[28][10] = new NodeCityMatrix(28, "南昌", 10, "乌鲁木齐", 1180, 385);
        CityMatrix[28][11] = new NodeCityMatrix(28, "南昌", 11, "兰州", 300, 150);
        CityMatrix[28][12] = new NodeCityMatrix(28, "南昌", 12, "西宁", 637, 430);
        CityMatrix[28][13] = new NodeCityMatrix(28, "南昌", 13, "西安", 360, 115);
        CityMatrix[28][14] = new NodeCityMatrix(28, "南昌", 14, "银川", 740, 285);
        CityMatrix[28][15] = new NodeCityMatrix(28, "南昌", 15, "郑州", 500, 100);
        CityMatrix[28][16] = new NodeCityMatrix(28, "南昌", 16, "济南", 645, 735);
        CityMatrix[28][17] = new NodeCityMatrix(28, "南昌", 17, "太原", 250, 120);
        CityMatrix[28][18] = new NodeCityMatrix(28, "南昌", 18, "合肥", 440, 370);
        CityMatrix[28][19] = new NodeCityMatrix(28, "南昌", 19, "长沙", 9999, 9999);
        CityMatrix[28][20] = new NodeCityMatrix(28, "南昌", 20, "武汉", 9999, 9999);
        CityMatrix[28][21] = new NodeCityMatrix(28, "南昌", 21, "南京", 379, 75);
        CityMatrix[28][22] = new NodeCityMatrix(28, "南昌", 22, "成都", 500, 135);
        CityMatrix[28][23] = new NodeCityMatrix(28, "南昌", 23, "贵阳", 479, 110);
        CityMatrix[28][24] = new NodeCityMatrix(28, "南昌", 24, "昆明", 320, 135);
        CityMatrix[28][25] = new NodeCityMatrix(28, "南昌", 25, "南宁", 460, 130);
        CityMatrix[28][26] = new NodeCityMatrix(28, "南昌", 26, "拉萨", 857, 470);
        CityMatrix[28][27] = new NodeCityMatrix(28, "南昌", 27, "杭州", 9999, 9999);
        CityMatrix[28][29] = new NodeCityMatrix(28, "南昌", 29, "广州", 440, 90);
        CityMatrix[28][30] = new NodeCityMatrix(28, "南昌", 30, "福州", 727, 365);
        CityMatrix[28][31] = new NodeCityMatrix(28, "南昌", 31, "台北", 3924, 920);
        CityMatrix[28][32] = new NodeCityMatrix(28, "南昌", 32, "海口", 245, 125);

        //29-广州
        CityMatrix[29][1] = new NodeCityMatrix(29, "广州", 1, "北京", 630, 170);
        CityMatrix[29][2] = new NodeCityMatrix(29, "广州", 2, "上海", 290, 145);
        CityMatrix[29][3] = new NodeCityMatrix(29, "广州", 3, "天津", 345, 180);
        CityMatrix[29][4] = new NodeCityMatrix(29, "广州", 4, "重庆", 330, 120);
        CityMatrix[29][5] = new NodeCityMatrix(29, "广州", 5, "哈尔滨", 580, 345);
        CityMatrix[29][6] = new NodeCityMatrix(29, "广州", 6, "长春", 300, 330);
        CityMatrix[29][7] = new NodeCityMatrix(29, "广州", 7, "沈阳", 450, 225);
        CityMatrix[29][8] = new NodeCityMatrix(29, "广州", 8, "呼和浩特", 300, 210);
        CityMatrix[29][9] = new NodeCityMatrix(29, "广州", 9, "石家庄", 230, 180);
        CityMatrix[29][10] = new NodeCityMatrix(29, "广州", 10, "乌鲁木齐", 690, 325);
        CityMatrix[29][11] = new NodeCityMatrix(29, "广州", 11, "兰州", 300, 185);
        CityMatrix[29][12] = new NodeCityMatrix(29, "广州", 12, "西宁", 780, 190);
        CityMatrix[29][13] = new NodeCityMatrix(29, "广州", 13, "西安", 269, 145);
        CityMatrix[29][14] = new NodeCityMatrix(29, "广州", 14, "银川", 510, 300);
        CityMatrix[29][15] = new NodeCityMatrix(29, "广州", 15, "郑州", 370, 160);
        CityMatrix[29][16] = new NodeCityMatrix(29, "广州", 16, "济南", 710, 170);
        CityMatrix[29][17] = new NodeCityMatrix(29, "广州", 17, "太原", 290, 170);
        CityMatrix[29][18] = new NodeCityMatrix(29, "广州", 18, "合肥", 239, 145);
        CityMatrix[29][19] = new NodeCityMatrix(29, "广州", 19, "长沙", 520, 80);
        CityMatrix[29][20] = new NodeCityMatrix(29, "广州", 20, "武汉", 400, 110);
        CityMatrix[29][21] = new NodeCityMatrix(29, "广州", 21, "南京", 659, 145);
        CityMatrix[29][22] = new NodeCityMatrix(29, "广州", 22, "成都", 420, 150);
        CityMatrix[29][23] = new NodeCityMatrix(29, "广州", 23, "贵阳", 269, 105);
        CityMatrix[29][24] = new NodeCityMatrix(29, "广州", 24, "昆明", 530, 150);
        CityMatrix[29][25] = new NodeCityMatrix(29, "广州", 25, "南宁", 650, 320);
        CityMatrix[29][26] = new NodeCityMatrix(29, "广州", 26, "拉萨", 2610, 360);
        CityMatrix[29][27] = new NodeCityMatrix(29, "广州", 27, "杭州", 410, 120);
        CityMatrix[29][28] = new NodeCityMatrix(29, "广州", 28, "南昌", 390, 100);
        CityMatrix[29][30] = new NodeCityMatrix(29, "广州", 30, "福州", 1230, 110);
        CityMatrix[29][31] = new NodeCityMatrix(29, "广州", 31, "台北", 4354, 680);
        CityMatrix[29][32] = new NodeCityMatrix(29, "广州", 32, "海口", 409, 90);

        //30-福州
        CityMatrix[30][1] = new NodeCityMatrix(30, "福州", 1, "北京", 633, 165);
        CityMatrix[30][2] = new NodeCityMatrix(30, "福州", 2, "上海", 470, 90);
        CityMatrix[30][3] = new NodeCityMatrix(30, "福州", 3, "天津", 590, 160);
        CityMatrix[30][4] = new NodeCityMatrix(30, "福州", 4, "重庆", 399, 170);
        CityMatrix[30][5] = new NodeCityMatrix(30, "福州", 5, "哈尔滨", 470, 320);
        CityMatrix[30][6] = new NodeCityMatrix(30, "福州", 6, "长春", 880, 340);
        CityMatrix[30][7] = new NodeCityMatrix(30, "福州", 7, "沈阳", 390, 200);
        CityMatrix[30][8] = new NodeCityMatrix(30, "福州", 8, "呼和浩特", 410, 285);
        CityMatrix[30][9] = new NodeCityMatrix(30, "福州", 9, "石家庄", 340, 255);
        CityMatrix[30][10] = new NodeCityMatrix(30, "福州", 10, "乌鲁木齐", 700, 440);
        CityMatrix[30][11] = new NodeCityMatrix(30, "福州", 11, "兰州", 406, 90);
        CityMatrix[30][12] = new NodeCityMatrix(30, "福州", 12, "西宁", 520, 355);
        CityMatrix[30][13] = new NodeCityMatrix(30, "福州", 13, "西安", 309, 170);
        CityMatrix[30][14] = new NodeCityMatrix(30, "福州", 14, "银川", 1785, 200);
        CityMatrix[30][15] = new NodeCityMatrix(30, "福州", 15, "郑州", 270, 135);
        CityMatrix[30][16] = new NodeCityMatrix(30, "福州", 16, "济南", 250, 130);
        CityMatrix[30][17] = new NodeCityMatrix(30, "福州", 17, "太原", 430, 155);
        CityMatrix[30][18] = new NodeCityMatrix(30, "福州", 18, "合肥", 550, 385);
        CityMatrix[30][19] = new NodeCityMatrix(30, "福州", 19, "长沙", 290, 95);
        CityMatrix[30][20] = new NodeCityMatrix(30, "福州", 20, "武汉", 760, 385);
        CityMatrix[30][21] = new NodeCityMatrix(30, "福州", 21, "南京", 230, 90);
        CityMatrix[30][22] = new NodeCityMatrix(30, "福州", 22, "成都", 480, 170);
        CityMatrix[30][23] = new NodeCityMatrix(30, "福州", 23, "贵阳", 443, 150);
        CityMatrix[30][24] = new NodeCityMatrix(30, "福州", 24, "昆明", 497, 170);
        CityMatrix[30][25] = new NodeCityMatrix(30, "福州", 25, "南宁", 400, 150);
        CityMatrix[30][26] = new NodeCityMatrix(30, "福州", 26, "拉萨", 1030, 505);
        CityMatrix[30][27] = new NodeCityMatrix(30, "福州", 27, "杭州", 720, 340);
        CityMatrix[30][28] = new NodeCityMatrix(30, "福州", 28, "南昌", 560, 605);
        CityMatrix[30][29] = new NodeCityMatrix(30, "福州", 29, "广州", 1230, 100);
        CityMatrix[30][31] = new NodeCityMatrix(30, "福州", 31, "台北", 3924, 930);
        CityMatrix[30][32] = new NodeCityMatrix(30, "福州", 32, "海口", 532, 140);

        //31-台北
        CityMatrix[31][1] = new NodeCityMatrix(31, "台北", 1, "北京", 583.0, 125);
        CityMatrix[31][2] = new NodeCityMatrix(31, "台北", 2, "上海", 9999, 9999);
        CityMatrix[31][3] = new NodeCityMatrix(31, "台北", 3, "天津", 500, 180);
        CityMatrix[31][4] = new NodeCityMatrix(31, "台北", 4, "重庆", 1330, 120);
        CityMatrix[31][5] = new NodeCityMatrix(31, "台北", 5, "哈尔滨", 782, 125);
        CityMatrix[31][6] = new NodeCityMatrix(31, "台北", 6, "长春", 740, 95);
        CityMatrix[31][7] = new NodeCityMatrix(31, "台北", 7, "沈阳", 650, 80);
        CityMatrix[31][8] = new NodeCityMatrix(31, "台北", 8, "呼和浩特", 9999, 9999);
        CityMatrix[31][9] = new NodeCityMatrix(31, "台北", 9, "石家庄", 1571, 490);
        CityMatrix[31][10] = new NodeCityMatrix(31, "台北", 10, "乌鲁木齐", 1340, 140);
        CityMatrix[31][11] = new NodeCityMatrix(31, "台北", 11, "兰州", 1797, 490);
        CityMatrix[31][12] = new NodeCityMatrix(31, "台北", 12, "西宁", 745, 140);
        CityMatrix[31][13] = new NodeCityMatrix(31, "台北", 13, "西安", 1530, 130);
        CityMatrix[31][14] = new NodeCityMatrix(31, "台北", 14, "银川", 810, 430);
        CityMatrix[31][15] = new NodeCityMatrix(31, "台北", 15, "郑州", 750, 665);
        CityMatrix[31][16] = new NodeCityMatrix(31, "台北", 16, "济南", 645, 735);
        CityMatrix[31][17] = new NodeCityMatrix(31, "台北", 17, "太原", 400, 125);
        CityMatrix[31][18] = new NodeCityMatrix(31, "台北", 18, "合肥", 788, 155);
        CityMatrix[31][19] = new NodeCityMatrix(31, "台北", 19, "长沙", 711, 510);
        CityMatrix[31][20] = new NodeCityMatrix(31, "台北", 20, "武汉", 1065, 520);
        CityMatrix[31][21] = new NodeCityMatrix(31, "台北", 21, "南京", 9999, 9999);
        CityMatrix[31][22] = new NodeCityMatrix(31, "台北", 22, "成都", 9999, 9999);
        CityMatrix[31][23] = new NodeCityMatrix(31, "台北", 23, "贵阳", 1122, 340);
        CityMatrix[31][24] = new NodeCityMatrix(31, "台北", 24, "昆明", 1075, 290);
        CityMatrix[31][25] = new NodeCityMatrix(31, "台北", 25, "南宁", 1850, 225);
        CityMatrix[31][26] = new NodeCityMatrix(31, "台北", 26, "拉萨", 1130, 665);
        CityMatrix[31][27] = new NodeCityMatrix(31, "台北", 27, "杭州", 460, 130);
        CityMatrix[31][28] = new NodeCityMatrix(31, "台北", 28, "南昌", 600, 755);
        CityMatrix[31][29] = new NodeCityMatrix(31, "台北", 29, "广州", 473, 215);
        CityMatrix[31][30] = new NodeCityMatrix(31, "台北", 30, "福州", 2010, 185);
        CityMatrix[31][32] = new NodeCityMatrix(31, "台北", 32, "海口", 9999, 9999);

        //32-海口
        CityMatrix[32][1] = new NodeCityMatrix(32, "海口", 1, "北京", 900, 235);
        CityMatrix[32][2] = new NodeCityMatrix(32, "海口", 2, "上海", 430, 180);
        CityMatrix[32][3] = new NodeCityMatrix(32, "海口", 3, "天津", 610, 215);
        CityMatrix[32][4] = new NodeCityMatrix(32, "海口", 4, "重庆", 240, 120);
        CityMatrix[32][5] = new NodeCityMatrix(32, "海口", 5, "哈尔滨", 1027, 390);
        CityMatrix[32][6] = new NodeCityMatrix(32, "海口", 6, "长春", 970, 390);
        CityMatrix[32][7] = new NodeCityMatrix(32, "海口", 7, "沈阳", 680, 380);
        CityMatrix[32][8] = new NodeCityMatrix(32, "海口", 8, "呼和浩特", 1294, 390);
        CityMatrix[32][9] = new NodeCityMatrix(32, "海口", 9, "石家庄", 860, 355);
        CityMatrix[32][10] = new NodeCityMatrix(32, "海口", 10, "乌鲁木齐", 1290, 425);
        CityMatrix[32][11] = new NodeCityMatrix(32, "海口", 11, "兰州", 690, 265);
        CityMatrix[32][12] = new NodeCityMatrix(32, "海口", 12, "西宁", 660, 590);
        CityMatrix[32][13] = new NodeCityMatrix(32, "海口", 13, "西安", 295, 300);
        CityMatrix[32][14] = new NodeCityMatrix(32, "海口", 14, "银川", 680, 315);
        CityMatrix[32][15] = new NodeCityMatrix(32, "海口", 15, "郑州", 410, 175);
        CityMatrix[32][16] = new NodeCityMatrix(32, "海口", 16, "济南", 567, 195);
        CityMatrix[32][17] = new NodeCityMatrix(32, "海口", 17, "太原", 450, 195);
        CityMatrix[32][18] = new NodeCityMatrix(32, "海口", 18, "合肥", 540, 150);
        CityMatrix[32][19] = new NodeCityMatrix(32, "海口", 19, "长沙", 415, 115);
        CityMatrix[32][20] = new NodeCityMatrix(32, "海口", 20, "武汉", 640, 135);
        CityMatrix[32][21] = new NodeCityMatrix(32, "海口", 21, "南京", 400, 185);
        CityMatrix[32][22] = new NodeCityMatrix(32, "海口", 22, "成都", 400, 135);
        CityMatrix[32][23] = new NodeCityMatrix(32, "海口", 23, "贵阳", 179, 105);
        CityMatrix[32][24] = new NodeCityMatrix(32, "海口", 24, "昆明", 227, 120);
        CityMatrix[32][25] = new NodeCityMatrix(32, "海口", 25, "南宁", 170, 60);
        CityMatrix[32][26] = new NodeCityMatrix(32, "海口", 26, "拉萨", 1000, 385);
        CityMatrix[32][27] = new NodeCityMatrix(32, "海口", 27, "杭州", 197, 155);
        CityMatrix[32][28] = new NodeCityMatrix(32, "海口", 28, "南昌", 210, 130);
        CityMatrix[32][29] = new NodeCityMatrix(32, "海口", 29, "广州", 380, 80);
        CityMatrix[32][30] = new NodeCityMatrix(32, "海口", 30, "福州", 457, 115);
        CityMatrix[32][31] = new NodeCityMatrix(32, "海口", 31, "台北", 1274, 1110);


        NodeCity[] City = new NodeCity[33];
        /*
        * 数组形如{
        * [1,北京结点]
        * [2,上海结点]
        * [3,天津结点]
        * ...}
        *
        * 结点信息形如
        * {
        * [1,北京,3,天津,公路金额,公路时间,铁路金额,铁路时间]
        * [1,北京,9,石家庄,公路金额,公路时间,铁路金额,铁路时间]
        * }
        * */

        City[1] = new NodeCity(1, "北京", 2);
        City[1].add(new NodeCitySide(1, "北京", 3, "天津", 103.5, 116, 54.5, 30));
        City[1].add(new NodeCitySide(1, "北京", 9, "石家庄", 249, 216, 128.5, 80));

        City[2] = new NodeCity(2, "上海", 2);
        City[2].add(new NodeCitySide(2, "上海", 21, "南京", 276, 254, 46.5, 270));
        City[2].add(new NodeCitySide(2, "上海", 27, "杭州", 151, 163, 73, 50));

        City[3] = new NodeCity(3, "天津", 2);
        City[3].add(new NodeCitySide(3, "天津", 1, "北京", 103.5, 116, 54.5, 30));
        City[3].add(new NodeCitySide(3, "天津", 9, "石家庄", 292, 247, 62.5, 360));

        City[4] = new NodeCity(4, "重庆", 5);
        City[4].add(new NodeCitySide(4, "重庆", 22, "成都", 327.5, 214, 154, 102));
        City[4].add(new NodeCitySide(4, "重庆", 13, "西安", 746, 536, 281.5, 330));
        City[4].add(new NodeCitySide(4, "重庆", 20, "武汉", 937, 650, 138.5, 678));
        City[4].add(new NodeCitySide(4, "重庆", 19, "长沙", 892.5, 640, 105, 640));
        City[4].add(new NodeCitySide(4, "重庆", 23, "贵阳", 393.5, 305, 138, 123));

        City[5] = new NodeCity(5, "哈尔滨", 2);
        City[5].add(new NodeCitySide(5, "哈尔滨", 6, "长春", 264, 220, 113.5, 80));
        City[5].add(new NodeCitySide(5, "哈尔滨", 8, "呼和浩特", 1568.5, 1138, 198, 15770));

        City[6] = new NodeCity(6, "长春", 3);
        City[6].add(new NodeCitySide(6, "长春", 5, "哈尔滨", 264, 220, 37.5, 160));
        City[6].add(new NodeCitySide(6, "长春", 7, "沈阳", 290.5, 215, 43.5, 219));
        City[6].add(new NodeCitySide(6, "长春", 8, "呼和浩特", 1315, 976, 177.5, 1397));

        City[7] = new NodeCity(7, "沈阳", 3);
        City[7].add(new NodeCitySide(7, "沈阳", 6, "长春", 290.5, 215, 95.5, 117));
        City[7].add(new NodeCitySide(7, "沈阳", 8, "呼和浩特", 1072.5, 880, 177.5, 1284));
        City[7].add(new NodeCitySide(7, "沈阳", 9, "石家庄", 891.5, 784, 365, 381));

        City[8] = new NodeCity(8, "呼和浩特", 8);
        City[8].add(new NodeCitySide(8, "呼和浩特", 5, "哈尔滨", 1568.5, 1138, 198, 1459));
        City[8].add(new NodeCitySide(8, "呼和浩特", 6, "长春", 1315, 976, 177.5, 1264));
        City[8].add(new NodeCitySide(8, "呼和浩特", 7, "沈阳", 1072.5, 880, 177.5, 1374));
        City[8].add(new NodeCitySide(8, "呼和浩特", 9, "石家庄", 515, 636, 119, 804));
        City[8].add(new NodeCitySide(8, "呼和浩特", 17, "太原", 409.5, 343, 75, 549));
        City[8].add(new NodeCitySide(8, "呼和浩特", 13, "西安", 858.5, 742, 138.5, 820));
        City[8].add(new NodeCitySide(8, "呼和浩特", 14, "银川", 628.5, 517, 82, 535));
        City[8].add(new NodeCitySide(8, "呼和浩特", 11, "兰州", 867.5, 821, 124.5, 1020));

        City[9] = new NodeCity(9, "石家庄", 7);
        City[9].add(new NodeCitySide(9, "石家庄", 16, "济南", 295, 264, 114, 108));
        City[9].add(new NodeCitySide(9, "石家庄", 17, "太原", 187.5, 199, 71.5, 90));
        City[9].add(new NodeCitySide(9, "石家庄", 15, "郑州", 376.5, 325, 62.5, 230));
        City[9].add(new NodeCitySide(9, "石家庄", 8, "呼和浩特", 515, 636, 119, 835));
        City[9].add(new NodeCitySide(9, "石家庄", 7, "沈阳", 891.5, 784, 138.5, 798));
        City[9].add(new NodeCitySide(9, "石家庄", 1, "北京", 249, 216, 128.5, 80));
        City[9].add(new NodeCitySide(9, "石家庄", 3, "天津", 292, 247, 62.5, 360));

        City[10] = new NodeCity(10, "乌鲁木齐", 3);
        City[10].add(new NodeCitySide(10, "乌鲁木齐", 11, "兰州", 1654, 1266, 217, 1190));
        City[10].add(new NodeCitySide(10, "乌鲁木齐", 12, "西宁", 1318.5, 1271, 493, 580));
        City[10].add(new NodeCitySide(10, "乌鲁木齐", 26, "拉萨", 1686, 2071, 457, 2472));

        City[11] = new NodeCity(11, "兰州", 6);
        City[11].add(new NodeCitySide(11, "兰州", 12, "西宁", 178, 200, 58, 138));
        City[11].add(new NodeCitySide(11, "兰州", 14, "银川", 341, 321, 69, 530));
        City[11].add(new NodeCitySide(11, "兰州", 8, "呼和浩特", 867.5, 821, 148.5, 1065));
        City[11].add(new NodeCitySide(11, "兰州", 10, "乌鲁木齐", 1654, 1266, 217, 1220));
        City[11].add(new NodeCitySide(11, "兰州", 13, "西安", 554, 504, 199.5, 193.8));
        City[11].add(new NodeCitySide(11, "兰州", 22, "成都", 724.5, 760, 112, 660));

        City[12] = new NodeCity(12, "西宁", 4);
        City[12].add(new NodeCitySide(12, "西宁", 10, "乌鲁木齐", 1318.5, 1271, 493, 603));
        City[12].add(new NodeCitySide(12, "西宁", 11, "兰州", 178, 200, 32.5, 260));
        City[12].add(new NodeCitySide(12, "西宁", 22, "成都", 637.5, 909, 135.5, 260));
        City[12].add(new NodeCitySide(12, "西宁", 26, "拉萨", 1110, 1794, 224, 1290));

        City[13] = new NodeCity(13, "西安", 8);
        City[13].add(new NodeCitySide(13, "西安", 8, "呼和浩特", 858.5, 742, 138.5, 907));
        City[13].add(new NodeCitySide(13, "西安", 14, "银川", 640, 502, 102, 849));
        City[13].add(new NodeCitySide(13, "西安", 11, "兰州", 554, 504, 93, 477));
        City[13].add(new NodeCitySide(13, "西安", 22, "成都", 718, 632, 263, 254));
        City[13].add(new NodeCitySide(13, "西安", 4, "重庆", 746, 536, 279.5, 300));
        City[13].add(new NodeCitySide(13, "西安", 20, "武汉", 752, 538, 119, 738.6));
        City[13].add(new NodeCitySide(13, "西安", 15, "郑州", 470.5, 349, 239, 145));
        City[13].add(new NodeCitySide(13, "西安", 17, "太原", 521, 430, 178.5, 213));

        City[14] = new NodeCity(14, "银川", 3);
        City[14].add(new NodeCitySide(14, "银川", 8, "呼和浩特", 628.5, 517, 93, 454));
        City[14].add(new NodeCitySide(14, "银川", 11, "兰州", 341, 321, 69, 620));
        City[14].add(new NodeCitySide(14, "银川", 13, "西安", 640, 502, 102, 921));

        City[15] = new NodeCity(15, "郑州", 6);
        City[15].add(new NodeCitySide(15, "郑州", 9, "石家庄", 376.5, 325, 189.5, 81));
        City[15].add(new NodeCitySide(15, "郑州", 17, "太原", 384, 375, 260.5, 243));
        City[15].add(new NodeCitySide(15, "郑州", 13, "西安", 470.5, 349, 229, 135));
        City[15].add(new NodeCitySide(15, "郑州", 20, "武汉", 852.5, 729, 244, 135));
        City[15].add(new NodeCitySide(15, "郑州", 18, "合肥", 945, 765, 265, 142));
        City[15].add(new NodeCitySide(15, "郑州", 16, "济南", 470.5, 439, 298, 207));

        City[16] = new NodeCity(16, "济南", 4);
        City[16].add(new NodeCitySide(16, "济南", 9, "石家庄", 295, 264, 114, 135));
        City[16].add(new NodeCitySide(16, "济南", 15, "郑州", 470.5, 439, 303, 265));
        City[16].add(new NodeCitySide(16, "济南", 18, "合肥", 600, 464, 268.5, 174));
        City[16].add(new NodeCitySide(16, "济南", 21, "南京", 587, 456, 279, 127));

        City[17] = new NodeCity(17, "太原", 4);
        City[17].add(new NodeCitySide(17, "太原", 8, "呼和浩特", 409.5, 343, 75, 632));
        City[17].add(new NodeCitySide(17, "太原", 13, "西安", 521, 430, 178.5, 214));
        City[17].add(new NodeCitySide(17, "太原", 15, "郑州", 384, 375, 260.5, 228));
        City[17].add(new NodeCitySide(17, "太原", 9, "石家庄", 187.5, 199, 71.5, 100));

        City[18] = new NodeCity(18, "合肥", 6);
        City[18].add(new NodeCitySide(18, "合肥", 16, "济南", 600, 464, 268.5, 142));
        City[18].add(new NodeCitySide(18, "合肥", 15, "郑州", 945, 765, 259, 190));
        City[18].add(new NodeCitySide(18, "合肥", 20, "武汉", 392.5, 279, 133, 139));
        City[18].add(new NodeCitySide(18, "合肥", 28, "南昌", 427.5, 320, 316, 281));
        City[18].add(new NodeCitySide(18, "合肥", 27, "杭州", 401, 316, 64.5, 322));
        City[18].add(new NodeCitySide(18, "合肥", 21, "南京", 177, 153, 67, 52));

        City[19] = new NodeCity(19, "长沙", 6);
        City[19].add(new NodeCitySide(19, "长沙", 20, "武汉", 285.5, 267, 164.5, 78));
        City[19].add(new NodeCitySide(19, "长沙", 4, "重庆", 892, 640, 448.5, 325));
        City[19].add(new NodeCitySide(19, "长沙", 23, "贵阳", 839.5, 623, 310.5, 210));
        City[19].add(new NodeCitySide(19, "长沙", 25, "南宁", 833, 605, 314, 340));
        City[19].add(new NodeCitySide(19, "长沙", 29, "广州", 653.5, 493, 314, 168));
        City[19].add(new NodeCitySide(19, "长沙", 28, "南昌", 308, 257, 157, 99));

        City[20] = new NodeCity(20, "武汉", 6);
        City[20].add(new NodeCitySide(20, "武汉", 15, "郑州", 852.5, 729, 244, 127));
        City[20].add(new NodeCitySide(20, "武汉", 13, "西安", 752, 538, 454.5, 237));
        City[20].add(new NodeCitySide(20, "武汉", 4, "重庆", 937, 650, 278.5, 354));
        City[20].add(new NodeCitySide(20, "武汉", 19, "长沙", 285.5, 267, 164.5, 78));
        City[20].add(new NodeCitySide(20, "武汉", 28, "南昌", 300, 283, 107, 141));
        City[20].add(new NodeCitySide(20, "武汉", 18, "合肥", 392.5, 279, 133, 123));

        City[21] = new NodeCity(21, "南京", 4);
        City[21].add(new NodeCitySide(21, "南京", 16, "济南", 587, 456, 279, 151));
        City[21].add(new NodeCitySide(21, "南京", 18, "合肥", 177, 153, 67, 56));
        City[21].add(new NodeCitySide(21, "南京", 27, "杭州", 258, 221, 119, 87));
        City[21].add(new NodeCitySide(21, "南京", 2, "上海", 276, 254, 144.5, 122));

        City[22] = new NodeCity(22, "成都", 7);
        City[22].add(new NodeCitySide(22, "成都", 11, "兰州", 724.5, 760, 230, 414));
        City[22].add(new NodeCitySide(22, "成都", 12, "西宁", 637.5, 909, 135.5, 939));
        City[22].add(new NodeCitySide(22, "成都", 26, "拉萨", 1110, 1750, 302.5, 2178));
        City[22].add(new NodeCitySide(22, "成都", 24, "昆明", 870, 652, 464.5, 381));
        City[22].add(new NodeCitySide(22, "成都", 23, "贵阳", 691.5, 451, 260, 248));
        City[22].add(new NodeCitySide(22, "成都", 4, "重庆", 327.5, 214, 154, 248));
        City[22].add(new NodeCitySide(22, "成都", 13, "西安", 718, 632, 226, 230));

        City[23] = new NodeCity(23, "贵阳", 5);
        City[23].add(new NodeCitySide(23, "贵阳", 4, "重庆", 393.5, 305, 139, 120));
        City[23].add(new NodeCitySide(23, "贵阳", 22, "成都", 691.5, 451, 296, 192));
        City[23].add(new NodeCitySide(23, "贵阳", 24, "昆明", 566.5, 428, 212.5, 127));
        City[23].add(new NodeCitySide(23, "贵阳", 25, "南宁", 614.5, 428, 284.5, 325));
        City[23].add(new NodeCitySide(23, "贵阳", 19, "长沙", 839.5, 623, 314.5, 209));

        City[24] = new NodeCity(24, "昆明", 4);
        City[24].add(new NodeCitySide(24, "昆明", 26, "拉萨", 1381, 1910, 800, 2574));
        City[24].add(new NodeCitySide(24, "昆明", 22, "成都", 870, 652, 497.5, 396));
        City[24].add(new NodeCitySide(24, "昆明", 23, "贵阳", 566.5, 428, 86, 385));
        City[24].add(new NodeCitySide(24, "昆明", 25, "南宁", 798.5, 599, 273, 281));

        City[25] = new NodeCity(25, "南宁", 4);
        City[25].add(new NodeCitySide(25, "南宁", 24, "昆明", 798.5, 599, 262.5, 260));
        City[25].add(new NodeCitySide(25, "南宁", 23, "贵阳", 614.5, 428, 115, 605));
        City[25].add(new NodeCitySide(25, "南宁", 19, "长沙", 833, 605, 119, 556));
        City[25].add(new NodeCitySide(25, "南宁", 29, "广州", 532.5, 397, 174, 218));

        City[26] = new NodeCity(26, "拉萨", 4);
        City[26].add(new NodeCitySide(26, "拉萨", 10, "乌鲁木齐", 1686, 2071, 457, 2487));
        City[26].add(new NodeCitySide(26, "拉萨", 12, "西宁", 1110, 1794, 224, 1300));
        City[26].add(new NodeCitySide(26, "拉萨", 22, "成都", 1110, 1750, 302.5, 2145));
        City[26].add(new NodeCitySide(26, "拉萨", 24, "昆明", 1381, 1910, 797, 2488));

        City[27] = new NodeCity(27, "杭州", 5);
        City[27].add(new NodeCitySide(27, "杭州", 2, "上海", 151, 163, 73, 60));
        City[27].add(new NodeCitySide(27, "杭州", 21, "南京", 258, 221, 117.5, 99));
        City[27].add(new NodeCitySide(27, "杭州", 18, "合肥", 401, 316, 184.5, 153));
        City[27].add(new NodeCitySide(27, "杭州", 28, "南昌", 471, 363, 263.5, 175.8));
        City[27].add(new NodeCitySide(27, "杭州", 30, "福州", 679, 507, 268, 309));

        City[28] = new NodeCity(28, "南昌", 6);
        City[28].add(new NodeCitySide(28, "南昌", 18, "合肥", 427.5, 320, 316, 256));
        City[28].add(new NodeCitySide(28, "南昌", 20, "武汉", 300, 283, 107, 172));
        City[28].add(new NodeCitySide(28, "南昌", 19, "长沙", 308, 257, 157, 100));
        City[28].add(new NodeCitySide(28, "南昌", 29, "广州", 775.5, 554, 472, 282));
        City[28].add(new NodeCitySide(28, "南昌", 30, "福州", 556, 420, 75, 382));
        City[28].add(new NodeCitySide(28, "南昌", 27, "杭州", 471, 363, 263.5, 177));

        City[29] = new NodeCity(29, "广州", 4);
        City[29].add(new NodeCitySide(29, "广州", 30, "福州", 920.5, 571, 354, 312));
        City[29].add(new NodeCitySide(29, "广州", 28, "南昌", 775.5, 554, 472, 264));
        City[29].add(new NodeCitySide(29, "广州", 19, "长沙", 653.5, 493, 315, 165));
        City[29].add(new NodeCitySide(29, "广州", 25, "南宁", 532.5, 397, 174, 219));

        City[30] = new NodeCity(30, "福州", 3);
        City[30].add(new NodeCitySide(30, "福州", 27, "杭州", 679, 507, 304.5, 199));
        City[30].add(new NodeCitySide(30, "福州", 28, "南昌", 556, 420, 169, 216));
        City[30].add(new NodeCitySide(30, "福州", 29, "广州", 920.5, 571, 328.5, 336));

        City[31] = new NodeCity(31, "台北", 1);

        City[32] = new NodeCity(32, "海口", 1);


    }
}


class NodeCityMatrix{

    int startPoint;     //起点序号
    String startCity;   //起点城市
    int endPoint;       //终点序号
    String endCity;     //终点城市
    double price;       //航班价格(RMB)
    double time;        //航班时间(day)

    public NodeCityMatrix(int startPoint, String startCity, int endPoint, String endCity, double price, double time) {
        this.startPoint = startPoint;
        this.startCity = startCity;
        this.endPoint = endPoint;
        this.endCity = endCity;
        this.price = price;
        this.time = time;
    }
}

class NodeCity {

    int num;                //城市序号
    String name;            //城市名称
    NodeCitySide[] sides;   //邻接城市
    int point;          //指针

    public NodeCity(int num, String name, int size) {
        this.num = num;
        this.name = name;
        sides = new NodeCitySide[size];
        point = 0;
    }

    public void add(NodeCitySide city) {
        sides[point] = city;
        point++;
    }
}

class NodeCitySide{

    int startPoint;     //起点序号
    String startCity;   //起点城市
    int endPoint;       //终点序号
    String endCity;     //终点城市
    double priceBus;       //公路价格(RMB)
    double timeBus;        //公路时间(day)
    double priceTrain;       //铁路价格(RMB)
    double timeTrain;        //铁路时间(day)

    public NodeCitySide(int startPoint, String startCity, int endPoint, String endCity, double priceBus, double timeBus, double priceTrain, double timeTrain) {
        this.startPoint = startPoint;
        this.startCity = startCity;
        this.endPoint = endPoint;
        this.endCity = endCity;
        this.priceBus = priceBus;
        this.timeBus = timeBus;
        this.priceTrain = priceTrain;
        this.timeTrain = timeTrain;
    }

}