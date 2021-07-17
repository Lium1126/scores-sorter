package jp.ac.ait.k19061;

/**
 * 第8回課題の点数データ1件分
 */
public interface IScore {
    String getId();
    String getName();
    int getJapanese();
    int getMathematic();
    int getScience();
    int getSocialStudy();
    int getEnglish();

    /**
     * 5教科の合計点を返す
     *
     * @return 5教科の合計点
     */
    int getSum();

    /**
     * 5教科の合計点に対する評価を文字列で返す (〜450:A, 449〜400:B, 399〜300:C, 299〜200:D, 199〜:E)
     *
     * @return A,B,C,D,Eのどれか
     */
    String getEvaluation();
}
