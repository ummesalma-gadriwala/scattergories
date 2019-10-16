import kotlin.random.Random

class Dice {

    val roll: Letters
        get() {
            return Letters.values()[Random.nextInt(0, Letters.values().size)]
        }

    enum class Letters(val isVowel: Boolean = false) {
        A(true),
        B,
        C,
        D,
        E(true),
        F,
        G,
        H,
        I(true),
        J,
        K,
        L,
        M,
        N,
        O(true),
        P,
        Q,
        R,
        S,
        T,
        U(true),
        V,
        W,
        X,
        Y,
        Z;
    }


}