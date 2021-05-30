package subtask2

class BillCounter {

    private val fairlySplit = "bon appetit"

    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        val sumAll = bill.sum()
        val sumWithoutFoodAnn = (sumAll - bill[k]) / 2

        return if(b > sumWithoutFoodAnn) (b - sumWithoutFoodAnn).toString()
        else fairlySplit
    }
}
