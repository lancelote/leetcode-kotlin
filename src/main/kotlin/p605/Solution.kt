package p605

class Solution {
    fun canPlaceFlowers(flowerbed: IntArray, n: Int): Boolean {
        var i = 0
        var leftToPlan = n

        while (i < flowerbed.size && leftToPlan != 0) {
            val prevOk = i == 0 || flowerbed[i - 1] == 0
            val nextOK = i == flowerbed.size - 1 || flowerbed[i + 1] == 0

            if (flowerbed[i] == 0 && prevOk && nextOK) {
                leftToPlan -= 1
                i += 1
            }

            i += 1
        }

        return leftToPlan == 0
    }
}
