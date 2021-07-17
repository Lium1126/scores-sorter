package jp.ac.ait.k19061;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ScoresSorter implements IScoresSorter {
    /*---フィールド---*/
    private List<IScore> data;

    /*---コンストラクタ---*/
    public ScoresSorter(List<IScore> data) {
        this.data = data;
    }

    /**
     * フィールドのdataを返す。
     * 他のメソッドを呼び出した場合に、このメソッドの戻り値が変わってしまわないように注意すること。
     * @return
     */
    @Override
    public List<IScore> getData() {
        return data;
    }

    /**
     * フィールドのdataのコピーを合計点の降順で並び替えを行う。ただし、同じ点数のデータがある場合は、学籍番号のUnicode昇順で並び替える。
     * @return
     */
    @Override
    public List<IScore> sortBySumDsc() {
        List<IScore> ret = new ArrayList<>(getData());

        Collections.sort(ret, (IScore o1, IScore o2) -> {
            if (o1.getSum() == o2.getSum()) {
                // 合計点が同じ場合は学籍番号の昇順でソート
                return o1.getId().compareTo(o2.getId());
            } else {
                // 合計点が違う場合は合計点の降順でソート
                return o2.getSum() - o1.getSum();
            }
        });

        return ret;
    }

    /**
     * フィールドのdataのコピーを評価のUnicodeの昇順で並び替えを行う。ただし、同じ評価のデータがある場合は、学籍番号のUnicode昇順で並び替える。
     * @return
     */
    @Override
    public List<IScore> sortByEvaluationAsc() {
        List<IScore> ret = new ArrayList<>(getData());

        Collections.sort(ret, (IScore o1, IScore o2) -> {
            if (o1.getEvaluation().equals(o2.getEvaluation())) {
                // 評価が同じ場合は学籍番号の昇順でソート
                return o1.getId().compareTo(o2.getId());
            } else {
                // 評価が違う場合は評価の降順でソート
                return o2.getEvaluation().compareTo(o1.getEvaluation());
            }
        });

        return ret;
    }
}
