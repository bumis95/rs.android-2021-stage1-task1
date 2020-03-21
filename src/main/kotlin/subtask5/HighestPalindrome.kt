package subtask5

class HighestPalindrome {

    fun highestValuePalindrome(n: Int, k: Int, digitString: String): String {

        val palindrome = digitString.toCharArray()
        var left = 0
        var count = k
        var right = digitString.length - 1

        while (left < right) {
            if (digitString[left] != digitString[right]) {
                palindrome[left] = maxOf(digitString[left], digitString[right])
                palindrome[right] = maxOf(digitString[left], digitString[right])
                count--
            }
            left++
            right--
        }

        if (count < 0) return "-1"

        left = 0
        right = digitString.length - 1

        while (left <= right) {
            if ((left == right) && (count > 0)) {
                palindrome[left] = '9'
            }
            if (palindrome[left] < '9') {
                if (count >= 2 && palindrome[left] == digitString[left]
                    && palindrome[right] == digitString[right]) {
                    palindrome[left] = '9'
                    palindrome[right] = '9'
                    right -= 2
                }
                else if (count >= 1 && (palindrome[left] != digitString[left]
                            || palindrome[right] != digitString[right])) {
                    palindrome[left] = '9'
                    palindrome[right] = '9'
                    count--
                }
            }
            left++
            right--
        }
        return palindrome.joinToString(separator = "")
    }
}
