package p12

class Solution {
    fun intToRoman(num: Int): String {
        var currentNum = num
        var result = ""

        val nums = arrayOf(1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1)
        val numToRoman = mapOf(
            1000 to "M",
            900 to "CM",
            500 to "D",
            400 to "CD",
            100 to "C",
            90 to "XC",
            50 to "L",
            40 to "XL",
            10 to "X",
            9 to "IX",
            5 to "V",
            4 to "IV",
            1 to "I"
        )

        while (currentNum != 0) {
            for (x in nums) {
                if (currentNum / x > 0) {
                    result += numToRoman[x]
                    currentNum -= x
                    break
                }
            }
        }

        return result
    }
}
