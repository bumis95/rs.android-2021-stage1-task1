package subtask3

class StringParser {

    private fun findCloseBracket(char: Char) = when (char) {
        '(' -> ')'
        '[' -> ']'
        else -> '>'
    }

    fun getResult(inputString: String): Array<String> {

        val list = mutableListOf<String>()
        var closeBracket: Char
        var counter = 0

        inputString.forEachIndexed { index, char ->

            if (char == '<' || char == '[' || char == '(') {
                closeBracket = findCloseBracket(char)
                loop@ for (innerIndex in (index + 1)..inputString.length) {
                    when(inputString[innerIndex]) {
                        char -> counter++
                        closeBracket -> {
                            if (counter == 0) {
                                list.add(inputString.substring(index + 1, innerIndex))
                                break@loop
                            }
                            else counter--
                        }
                    }
                }
            }
        }
//        println(list.joinToString())
        return list.toTypedArray()
    }
}
