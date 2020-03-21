package subtask1

class HappyArray {

    var needCycle = true

    fun convertToHappy(sadArray: IntArray): IntArray {

        var result = sadArray
        if (sadArray.isEmpty()) return result

        while (needCycle) {
            needCycle = false
            result = cycle(result)
        }

        return result
    }

    fun cycle(copyOfSadArray: IntArray) : IntArray {

        val happyArray = mutableListOf<Int>()
        val sizeSadArray = copyOfSadArray.size
        happyArray.add(copyOfSadArray[0])

        for (index in copyOfSadArray.indices) {
            when (index) {
                in 1..(sizeSadArray - 2) ->
                    if (copyOfSadArray[index] < (copyOfSadArray[index - 1] + copyOfSadArray[index + 1])) {
                        happyArray.add(copyOfSadArray[index])
                    }
                    else needCycle = true
            }
        }
        happyArray.add(copyOfSadArray[sizeSadArray-1])
        return happyArray.toIntArray()
    }
}
