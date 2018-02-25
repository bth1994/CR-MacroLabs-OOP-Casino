package io.zipcoder.casino.GameTools.Deck;

public enum Rank {

    ACE(1,
            "  _________ \n" +
            " |A        |\n" +
            " |+   *    |\n" +
            " |    !    |\n" +
            " |  *-+-*  |\n" +
            " |    |    |\n" +
            " |   ~~~  +|\n" +
            " |        V|\n" +
            "  ~~~~~~~~~"
    ),
    TWO(2,
            "  _________\n" +
            " |2        |\n" +
            " |+        |\n" +
            " |    +    |\n" +
            " |         |\n" +
            " |    +    |\n" +
            " |        +|\n" +
            " |        Z|\n" +
            "  ~~~~~~~~~"
    ),
    THREE(3,
            "  _________\n" +
            " |3        |\n" +
            " |+   +    |\n" +
            " |         |\n" +
            " |    +    |\n" +
            " |         |\n" +
            " |    +   +|\n" +
            " |        E|\n" +
            "  ~~~~~~~~~"
    ),
    FOUR(4,
            "  _________\n" +
            " |4        |\n" +
            " |+        |\n" +
            " |  +   +  |\n" +
            " |         |\n" +
            " |  +   +  |\n" +
            " |        +|\n" +
            " |        b|\n" +
            "  ~~~~~~~~~"
    ),
    FIVE(5,
            "  _________\n" +
            " |5        |\n" +
            " |+        |\n" +
            " |  +   +  |\n" +
            " |    +    |\n" +
            " |  +   +  |\n" +
            " |        +|\n" +
            " |        S|\n" +
            "  ~~~~~~~~~"
    ),
    SIX(6,
            "  _________\n" +
            " |6        |\n" +
            " |+ +   +  |\n" +
            " |         |\n" +
            " |  +   +  |\n" +
            " |         |\n" +
            " |  +   + +|\n" +
            " |        9|\n" +
            "  ~~~~~~~~~"
    ),
    SEVEN(7,
            "  _________\n" +
            " |7        |\n" +
            " |+ +   +  |\n" +
            " |    +    |\n" +
            " |  +   +  |\n" +
            " |         |\n" +
            " |  +   + +|\n" +
            " |        L|\n" +
            "  ~~~~~~~~~"
    ),
    EIGHT(8,
            "  _________\n" +
            " |8 +   +  |\n" +
            " |+        |\n" +
            " |  +   +  |\n" +
            " |         |\n" +
            " |  +   +  |\n" +
            " |        +|\n" +
            " |  +   + 8|\n" +
            "  ~~~~~~~~~"
    ),
    NINE(9,
            "  _________\n" +
            " |9 +   +  |\n" +
            " |+        |\n" +
            " |  +   +  |\n" +
            " |    +    |\n" +
            " |  +   +  |\n" +
            " |        +|\n" +
            " |  +   + 6|\n" +
            "  ~~~~~~~~~"),
    TEN(10,
            "  _________\n" +
            " |10+   +  |\n" +
            " |+   +    |\n" +
            " |  +   +  |\n" +
            " |         |\n" +
            " |  +   +  |\n" +
            " |    +   +|\n" +
            " |  +   +0l|\n" +
            "  ~~~~~~~~~ "),
    JACK(11,
            "  _________\n" +
            " |J /~~|_  |\n" +
            " |+ | o`,  |\n" +
            " |  | -|   |\n" +
            " | =~)+(_= |\n" +
            " |   |- |  |\n" +
            " |  `.o | +|\n" +
            " |  ~|__/ P|\n" +
            "  ~~~~~~~~~"),
    QUEEN(12,
            "  _________\n" +
            " |Q |~~~|  |\n" +
            " |+ /o,o\\  |\n" +
            " |  \\_-_/  |\n" +
            " | _-~+_-~ |\n" +
            " |  /~-~\\  |\n" +
            " |  \\o`o/  |\n" +
            " |  |___| Q|\n" +
            "  ~~~~~~~~~ "),
    KING(13,
            "  _________\n" +
            " |K |/|\\|  |\n" +
            " |+ /o,o\\  |\n" +
            " |  \\_-_/  |\n" +
            " | ~-_-~-_ |\n" +
            " |  /~-~\\  |\n" +
            " |  \\o`o/ +|\n" +
            " |  |\\|/| X|\n" +
            "  ~~~~~~~~~ ");

    private int rankValue;
    private String asciiValue;

    Rank(int rankValue, String asciiValue){
        this.rankValue = rankValue;
        this.asciiValue = asciiValue;
    }

    public int getRankValue(){
        return rankValue;
    }

    public String getAsciiValue(){
        return asciiValue;
    }

}
