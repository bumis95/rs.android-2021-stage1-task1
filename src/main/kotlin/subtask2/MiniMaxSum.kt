package subtask2

class MiniMaxSum {

    fun getMinElement(original: IntArray) = original.sum() - original.min()!!

    fun getMaxElement(original: IntArray) =  original.sum() - original.max()!!

    fun getResult(input: IntArray): IntArray {
        val minSum = getMinElement(input)
        val maxSum = getMaxElement(input)

        return intArrayOf(maxSum, minSum)
    }
}
