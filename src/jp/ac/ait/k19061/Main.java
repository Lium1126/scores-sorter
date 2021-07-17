package jp.ac.ait.k19061;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<IScore> arr = new ArrayList<>();
        // K19000~K19017は閾値チェックのための手打ちデータ
        // それ以外はランダムデータ
        arr.add(new Score("K19000", "相葉智也", 0, 0, 0, -1, 0));
        arr.add(new Score("K19001","相川匠",80,78,100,22,20));
        arr.add(new Score("K19002","阿部雅史",87,97,78,89,98));
        arr.add(new Score("K19003","安藤美香",100,0,35,65,0));
        arr.add(new Score("K19004","飯倉俊",100,0,100,10,90));
        arr.add(new Score("K19005","飯田真子",99,30,70,90,10));
        arr.add(new Score("K19006","井上裕太",100,100,100,100,101));
        arr.add(new Score("K19007","今泉和樹",100,0,100,100,100));
        arr.add(new Score("K19008","今田洋介",40,88,94,98,79));
        arr.add(new Score("K19009","遠藤正樹",87,88,97,99,78));
        arr.add(new Score("K19010","大倉雅史",100,37,95,89,79));
        arr.add(new Score("K19011","小倉美優",89,88,76,99,98));
        arr.add(new Score("K19012","尾崎茂",0,50,50,50,50));
        arr.add(new Score("K19013","影山俊",100,100,100,100,100));
        arr.add(new Score("K19014","加藤康太",68,79,65,95,92));
        arr.add(new Score("K19015","菅政志",50,0,50,0,99));
        arr.add(new Score("K19016","工藤太郎",100,100,0,0,99));
        arr.add(new Score("K19017","熊田雄介",96,84,96,86,88));
        arr.add(new Score("K19018","小泉次郎",23,51,100,71,49));
        arr.add(new Score("K19019","近藤茂雄",6,10,59,6,1));
        arr.add(new Score("K19020","斎藤正雄",40,65,61,36,94));
        arr.add(new Score("K19021","佐藤亮也",23,39,49,36,91));
        arr.add(new Score("K19022","篠原誠",18,91,12,19,13));
        arr.add(new Score("K19023","鈴木玲奈",19,70,79,91,60));
        arr.add(new Score("K19024","鈴木誉写",14,39,42,36,73));
        arr.add(new Score("K19025","鈴本悠",4,95,63,4,30));
        arr.add(new Score("K19026","鈴本藍子",100,74,63,86,52));
        arr.add(new Score("K19027","瀬田翔",55,32,91,98,76));
        arr.add(new Score("K19028","高田俊介",43,5,4,38,22));
        arr.add(new Score("K19029","高本陵",46,30,42,87,65));
        arr.add(new Score("K19030","瀧亮太郎",34,57,67,55,39));
        arr.add(new Score("K19031","武元雄介",17,15,48,44,66));
        arr.add(new Score("K19032","天童誠",81,59,94,84,100));
        arr.add(new Score("K19033","東堂秀介",99,45,5,68,33));
        arr.add(new Score("K19034","冨山昴",51,74,100,24,100));
        arr.add(new Score("K19035","内藤慎也",13,19,53,9,36));
        arr.add(new Score("K19036","内藤美由",77,82,45,10,59));
        arr.add(new Score("K19037","南條遥",80,83,90,77,90));
        arr.add(new Score("K19038","根本琢磨",30,32,15,86,44));
        arr.add(new Score("K19039","野沢冬馬",54,31,67,89,51));
        arr.add(new Score("K19040","長谷川浩太",85,16,100,68,25));
        arr.add(new Score("K19041","浜田康介",87,85,68,59,37));
        arr.add(new Score("K19042","平川幸助",100,78,100,76,59));
        arr.add(new Score("K19043","平田裕子",26,95,92,37,0));
        arr.add(new Score("K19044","平泉正",56,19,35,34,65));
        arr.add(new Score("K19045","福本美香",42,82,28,57,7));
        arr.add(new Score("K19046","藤田良輔",79,39,52,45,53));
        arr.add(new Score("K19047","宮野英司",51,85,36,57,55));
        arr.add(new Score("K19048","山田陽介",1,85,92,71,45));
        arr.add(new Score("K19049","山本咲",5,7,31,18,91));
        arr.add(new Score("K19050","山本孝太",74,73,54,8,15));
        IScoresSorter app = new ScoresSorter(arr);
        System.out.println("元データ");
        app.getData().stream().forEach((s) -> {
            System.out.printf("%s, %s, %d, %s%s", s.getId(), s.getName(), s.getSum(), s.getEvaluation(), System.lineSeparator());
        });

        System.out.println("合計点降順");
        app.sortBySumDsc().stream().forEach((s) -> {
            System.out.printf("%s, %s, %d, %s%s", s.getId(), s.getName(), s.getSum(), s.getEvaluation(), System.lineSeparator());
        });
        System.out.println("評価昇順");
        app.sortByEvaluationAsc().stream().forEach((s) -> {
            System.out.printf("%s, %s, %d, %s%s", s.getId(), s.getName(), s.getSum(), s.getEvaluation(), System.lineSeparator());
        });
    }
}
