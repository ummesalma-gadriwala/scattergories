import kotlin.random.Random

object Dice {

    // roll the dice and obtain a random letter
    val roll: Letter
        get() {
            return Letter.values()[Random.nextInt(0, Letter.values().size)]
        }

    // Letter enum with identification for vowel
    enum class Letter(val isVowel: Boolean = false) {
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