package jp.ac.ait.k19061;

import java.util.List;
/**
 * 第8回課題のソートプログラムインターフェイス
 */
public interface IScoresSorter {
    /**
     * フィールドのdataを返す。
     * 他のメソッドを呼び出した場合に、このメソッドの戻り値が変わってしまわないように注意すること。
     * @return
     */
    public List<IScore> getData();
    /**
     * フィールドのdataのコピーを合計点の降順で並び替えを行う。ただし、同じ点数のデータがある場合は、学籍番号のUnicode昇順で並び替えること。
     * @return
     */
    public List<IScore> sortBySumDsc();
    /**
     * フィールドのdataのコピーを評価のUnicodeの昇順で並び替えを行う。ただし、同じ評価のデータがある場合は、学籍番号のUnicode昇順で並び替えること。
     * @return
     */
    public List<IScore> sortByEvaluationAsc();
}
