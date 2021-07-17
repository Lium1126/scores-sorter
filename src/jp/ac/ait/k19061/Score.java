package jp.ac.ait.k19061;

/**
 * 第8回課題の点数データ1件分
 */
public class Score implements IScore {
    /*---フィールド---*/
    private String id;        // 学籍番号:文字列(K00000のようなアルファベット１文字+数字5桁のフォーマット)
    private String name;      // 名前:全角あり
    private int japanese;     // 国語の点数---+
    private int mathematic;   // 数学の点数---+
    private int science;      // 理科の点数---+-- 整数値(0~100)
    private int socialStudy;  // 社会科の点数-+
    private int english;      // 英語の点数---+

    /*---コンストラクタ---*/
    private Score() { }

    /**
     * それぞれの値をフィールドに設定するコンストラクタ
     * @param id 学籍番号
     * @param name 名前
     * @param japanese 国語の点数
     * @param mathematic 数学の点数
     * @param science 理科の点数
     * @param socialStudy 社会科の点数
     * @param english 英語の点数
     */
    public Score(String id, String name, int japanese, int mathematic, int science, int socialStudy, int english) {
        this.id = id;
        this.name = name;
        this.japanese = japanese;
        this.mathematic = mathematic;
        this.science = science;
        this.socialStudy = socialStudy;
        this.english = english;
    }

    /*---メソッド---*/
    @Override
    public String getId() { return id; }

    @Override
    public String getName() { return name; }

    @Override
    public int getJapanese() { return japanese; }

    @Override
    public int getMathematic() { return mathematic; }

    @Override
    public int getScience() { return science; }

    @Override
    public int getSocialStudy() { return socialStudy; }

    @Override
    public int getEnglish() { return this.english; }

    /**
     * 5教科の合計点を返す
     * @return 5教科の合計点
     */
    @Override
    public int getSum() { return (getJapanese() + getMathematic() + getScience() + getSocialStudy() + getEnglish()); }

    /**
     * 5教科の合計点に対する評価を文字列で返す (〜450:A, 449〜400:B, 399〜300:C, 299〜200:D, 199〜:E)
     * @return A,B,C,D,Eのどれか
     */
    @Override
    public String getEvaluation() {
        int sum = getSum();
        if (sum >= 450) {
            return "A";
        } else if (400 <= sum && sum <= 499) {
            return "B";
        } else if (300 <= sum && sum <= 399) {
            return "C";
        } else if (200 <= sum && sum <= 299) {
            return "D";
        } else {
            return "E";
        }
    }
}
