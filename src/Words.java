import java.util.Random;

class Words
{

    private String engVersion[];
    private String punjabiVersion[];
    private String WRONGengVersion[];
    private String WRONGpunjabiVersion[];
    private int z;

    int randomi(int i)
    {
        Random random = new Random();
        boolean flag = true;
        int k = i - 1;
        int l = 0;
        if(i == 0)
        {
            return i;
        }
        int j;
        for(j = random.nextInt((k - l) + 1) + l; j < 0; j = random.nextInt((k - l) + 1) + l) { }
        return j;
    }

    int[] randomNotAnswer(int i)
    {
        Random random = new Random();
        int ai[] = new int[3];
        boolean flag = true;
        byte byte0 = 31;
        int j = 0;
        for(int k = 0; k < 3; k++)
        {
            for(ai[k] = random.nextInt((byte0 - j) + 1) + j; ai[k] == i; ai[k] = random.nextInt((byte0 - j) + 1) + j) { }
        }

        return ai;
    }

    public Words()
    {
        engVersion = new String[32];
        punjabiVersion = new String[32];
        WRONGengVersion = new String[96];
        WRONGpunjabiVersion = new String[96];
    }

    protected void optio(int ai[])
    {
        z = -1;
        for(int i = 0; i < ai.length; i++)
        {
            int j = ai[i];
            String as[] = new String[0];
            String as1[] = new String[0];
            switch(++j)
            {
            case 1: // '\001'
                as = (new String[] {
                    "owl", "wool", "camel", "wait", "above", "north"
                });
                as1 = (new String[] {
                    "au`lU", "aUn", "aUT", "aufIk", "au`qy", "au`qr"
                });
                break;

            case 2: // '\002'
                as = (new String[] {
                    "mango", "pomegranate", "pickle", "newspaper", "sunday", "today", "eye", "pineapple", "grapes", "potato", 
                    "ginger"
                });
                as1 = (new String[] {
                    "AMb", "Anwr", "Acwr", "A^bwr", "AYqvwr", "A`j", "A`K", "Anwnws", "AMgUr", "AwlU", 
                    "Adrk"
                });
                break;

            case 3: // '\003'
                as = (new String[] {
                    "eagle", "brick", "tamarind", "one", "unity", "honesty"
                });
                as1 = (new String[] {
                    "ie`l", "ie`t", "iemlI", "eyk", "eykqw", "iemwndwrI"
                });
                break;

            case 4: // '\004'
                as = (new String[] {
                    "snake", "apple", "orange", "soap", "whistle", "road", "dry", "beautiful", "pig", "head", 
                    "monday"
                });
                as1 = (new String[] {
                    "s`p", "syb", "sMqrw", "swbx", "sItI", "sVk", "su`kw", "sohxw", "sUr", "isr", 
                    "somvwr"
                });
                break;

            case 5: // '\005'
                as = (new String[] {
                    "elephant", "swan", "necklace", "bone", "hand", "deer"
                });
                as1 = (new String[] {
                    "hwQI", "hMs", "hwr", "h`fI", "h`Q", "ihrx"
                });
                break;

            case 6: // '\006'
                as = (new String[] {
                    "bowl", "hair", "comb", "pigeon", "lotus", "dog", "blanket", "wheat", "paper", "chair", 
                    "ant", "prisoner", "work", "book", "ear", "loan"
                });
                as1 = (new String[] {
                    "ktorw", "kys", "kMGw", "kbUqr", "kml", "ku`qw", "kMbl", "kxk", "kwgz", "kursI", 
                    "kIVI", "kYdI", "kMm", "ikqwb", "kMn", "krzw"
                });
                break;

            case 7: // '\007'
                as = (new String[] {
                    "rabbit", "cucumber", "well", "toy", "donkey"
                });
                as1 = (new String[] {
                    "KrgoS", "KIrw", "KUh", "iKfoxw", "Koqw"
                });
                break;

            case 8: // '\b'
                as = (new String[] {
                    "cow", "carrot", "car", "balloon", "poor", "knowledge", "ball"
                });
                as1 = (new String[] {
                    "gW", "gwjr", "g`fI", "gubwrw", "grIb", "igAwn", "gyNd"
                });
                break;

            case 9: // '\t'
                as = (new String[] {
                    "horse", "home", "earthen-pot", "bell", "hour"
                });
                as1 = (new String[] {
                    "GoVw", "Gr", "GVw", "GMtI", "GMtw"
                });
                break;

            case 10: // '\n'
                as = (new String[] {
                    "lion", "mirror"
                });
                as1 = (new String[] {
                    "Syr", "SISw"
                });
                break;

            case 11: // '\013'
                as = (new String[] {
                    "mouse", "key", "spoon", "rice", "moon", "thief", "climb", "tea", "sparrow"
                });
                as1 = (new String[] {
                    "cUhw", "cwbI", "cm`c", "cwvl", "cMn", "cor", "cVxw", "cwh", "ic`VI"
                });
                break;

            case 12: // '\f'
                as = (new String[] {
                    "umbrella", "six", "roof", "peel"
                });
                as1 = (new String[] {
                    "Cwqw", "Cy", "Cq", "iClkw"
                });
                break;

            case 13: // '\r'
                as = (new String[] {
                    "ship", "forest", "rust", "floor", "pocket", "web", "prison", "class"
                });
                as1 = (new String[] {
                    "jhwz", "jMgl", "jMg", "zmIn", "jyb", "jwlw", "jyl", "jmwq"
                });
                break;

            case 14: // '\016'
                as = (new String[] {
                    "flag", "waterfall", "broom"
                });
                as1 = (new String[] {
                    "JMfw", "Jrnw", "JwVU"
                });
                break;

            case 15: // '\017'
                as = (new String[] {
                    "tomato"
                });
                as1 = (new String[] {
                    "tmwtr"
                });
                break;

            case 16: // '\020'
                as = (new String[] {
                    "stamp", "cold"
                });
                as1 = (new String[] {
                    "T`pw", "TMfw"
                });
                break;

            case 17: // '\021'
                as = (new String[] {
                    "frog", "box"
                });
                as1 = (new String[] {
                    "f`fU", "f`bw"
                });
                break;

            case 18: // '\022'
                as = (new String[] {
                    "drum", "lid", "shield"
                });
                as1 = (new String[] {
                    "Fol", "Fk`x", "Fwl"
                });
                break;

            case 19: // '\023'
                as = (new String[] {
                    "fast", "parrot", "three", "lock", "clap", "walk", "photo", "water-melon"
                });
                as1 = (new String[] {
                    "qyz", "qoqw", "iqMn", "qwlw", "qwlI", "qurnw", "qsvIr", "qrbUz"
                });
                break;

            case 20: // '\024'
                as = (new String[] {
                    "plate", "tired"
                });
                as1 = (new String[] {
                    "QwlI", "Qkxw"
                });
                break;

            case 21: // '\025'
                as = (new String[] {
                    "inkpot", "turban", "grandfather", "grandmother", "milk", "heart", "south", "pulse"
                });
                as1 = (new String[] {
                    "dvwq", "dsqwr", "dwdw", "dwdI", "du`D", "idl", "d`Kx", "dwl"
                });
                break;

            case 22: // '\026'
                as = (new String[] {
                    "earth", "thread", "wash", "daughter"
                });
                as1 = (new String[] {
                    "DrqI", "Dwgw", "Doxw", "DI"
                });
                break;

            case 23: // '\027'
                as = (new String[] {
                    "measure", "lemon", "nose", "pear"
                });
                as1 = (new String[] {
                    "nwpxw", "nINbU", "nwk", "nwK"
                });
                break;

            case 24: // '\030'
                as = (new String[] {
                    "leaf", "bird", "five", "son", "sin", "wings", "father", "generation", "bridge", "love", 
                    "swing", "east", "west"
                });
                as1 = (new String[] {
                    "p`qw", "pMCI", "pMj", "pu`qr", "pwp", "pMK/pr", "ipqw/ipa", "pIVI", "pu`l", "p@ym/ipAwr", 
                    "pING", "pUrb", "p`Cm"
                });
                break;

            case 25: // '\031'
                as = (new String[] {
                    "fruit", "flower", "army"
                });
                as1 = (new String[] {
                    "Pl", "Pu`l", "POj"
                });
                break;

            case 26: // '\032'
                as = (new String[] {
                    "cat", "duck", "speak", "garden", "monkey", "kid", "wednesday", "almond", "goat", "wolf"
                });
                as1 = (new String[] {
                    "ib`lI", "bq^", "bolxw", "bwZ/bgIcw", "bWdr", "b`cw", "bu`Dvwr", "bdwm", "bkrI", "biGAwV"
                });
                break;

            case 27: // '\033'
                as = (new String[] {
                    "bear", "sheep", "forget", "sister", "crowd"
                });
                as1 = (new String[] {
                    "BwlU", "Byf", "Bu`lxw", "BYx", "BIV"
                });
                break;

            case 28: // '\034'
                as = (new String[] {
                    "fish", "peacock", "my", "table", "temple", "mother", "forehead", "shoulder", "tuesday", "butter"
                });
                as1 = (new String[] {
                    "m`ClI", "mor", "myrw", "myz", "mMdr", "mW", "mwQw", "moFw", "mMglvwr", "m`Kx"
                });
                break;

            case 29: // '\035'
                as = (new String[] {
                    "memorial"
                });
                as1 = (new String[] {
                    "Xwdgwr"
                });
                break;

            case 30: // '\036'
                as = (new String[] {
                    "color", "night", "way", "king", "quilt"
                });
                as1 = (new String[] {
                    "rMg", "rwq", "rwh", "rwjw", "rjweI"
                });
                break;

            case 31: // '\037'
                as = (new String[] {
                    "fox", "garlic", "essay", "write"
                });
                as1 = (new String[] {
                    "lomVI", "l`sx", "lyK", "ilKxw"
                });
                break;

            case 32: // ' '
                as = (new String[] {
                    "calf", "wow", "bangles", "harmonium", "twenty", "thursday"
                });
                as1 = (new String[] {
                    "v`Cw", "vwh", "vMgW", "vwjw", "vIh", "vIrvwr"
                });
                break;
            }
            int k = randomi(as.length);
            engVersion[++z] = as[k];
            punjabiVersion[z] = as1[k];
        }

    }

    public String[] getEnglishWords()
    {
        return engVersion;
    }

    public String[] getPunjabiVersion()
    {
        return punjabiVersion;
    }

    public void getWrongAnswers(int ai[])
    {
        int i = -1;
        for(int j = 0; j < ai.length; j++)
        {
            int k = ai[j];
            int ai1[] = randomNotAnswer(k);
            String as[] = new String[0];
            String as1[] = new String[0];
            for(int i1 = 0; i1 < 3; i1++)
            {
                int l = ai1[i1];
                switch(++l)
                {
                case 1: // '\001'
                    as = (new String[] {
                        "owl", "wool", "camel", "wait", "above", "north"
                    });
                    as1 = (new String[] {
                        "au`lU", "aUn", "aUT", "aufIk", "au`qy", "au`qr"
                    });
                    break;

                case 2: // '\002'
                    as = (new String[] {
                        "mango", "pomegranate", "pickle", "newspaper", "sunday", "today", "eye", "pineapple", "grapes", "potato", 
                        "ginger"
                    });
                    as1 = (new String[] {
                        "AMb", "Anwr", "Acwr", "A^bwr", "AYqvwr", "A`j", "A`K", "Anwnws", "AMgUr", "AwlU", 
                        "Adrk"
                    });
                    break;

                case 3: // '\003'
                    as = (new String[] {
                        "eagle", "brick", "tamarind", "one", "unity", "honesty"
                    });
                    as1 = (new String[] {
                        "ie`l", "ie`t", "iemlI", "eyk", "eykqw", "iemwndwrI"
                    });
                    break;

                case 4: // '\004'
                    as = (new String[] {
                        "snake", "apple", "orange", "soap", "whistle", "road", "dry", "beautiful", "pig", "head", 
                        "monday"
                    });
                    as1 = (new String[] {
                        "s`p", "syb", "sMqrw", "swbx", "sItI", "sVk", "su`kw", "sohxw", "sUr", "isr", 
                        "somvwr"
                    });
                    break;

                case 5: // '\005'
                    as = (new String[] {
                        "elephant", "swan", "necklace", "bone", "hand", "deer"
                    });
                    as1 = (new String[] {
                        "hwQI", "hMs", "hwr", "h`fI", "h`Q", "ihrx"
                    });
                    break;

                case 6: // '\006'
                    as = (new String[] {
                        "bowl", "hair", "comb", "pigeon", "lotus", "dog", "blanket", "wheat", "paper", "chair", 
                        "ant", "prisoner", "work", "book", "ear", "loan"
                    });
                    as1 = (new String[] {
                        "ktorw", "kys", "kMGw", "kbUqr", "kml", "ku`qw", "kMbl", "kxk", "kwgz", "kursI", 
                        "kIVI", "kYdI", "kMm", "ikqwb", "kMn", "krzw"
                    });
                    break;

                case 7: // '\007'
                    as = (new String[] {
                        "rabbit", "cucumber", "well", "toy", "donkey"
                    });
                    as1 = (new String[] {
                        "KrgoS", "KIrw", "KUh", "iKfoxw", "Koqw"
                    });
                    break;

                case 8: // '\b'
                    as = (new String[] {
                        "cow", "carrot", "car", "balloon", "poor", "knowledge", "ball"
                    });
                    as1 = (new String[] {
                        "gW", "gwjr", "g`fI", "gubwrw", "grIb", "igAwn", "gyNd"
                    });
                    break;

                case 9: // '\t'
                    as = (new String[] {
                        "horse", "home", "earthen-pot", "bell", "hour"
                    });
                    as1 = (new String[] {
                        "GoVw", "Gr", "GVw", "GMtI", "GMtw"
                    });
                    break;

                case 10: // '\n'
                    as = (new String[] {
                        "lion", "mirror"
                    });
                    as1 = (new String[] {
                        "Syr", "SISw"
                    });
                    break;

                case 11: // '\013'
                    as = (new String[] {
                        "mouse", "key", "spoon", "rice", "moon", "thief", "climb", "tea", "sparrow"
                    });
                    as1 = (new String[] {
                        "cUhw", "cwbI", "cm`c", "cwvl", "cMn", "cor", "cVxw", "cwh", "ic`VI"
                    });
                    break;

                case 12: // '\f'
                    as = (new String[] {
                        "umbrella", "six", "roof", "peel"
                    });
                    as1 = (new String[] {
                        "Cwqw", "Cy", "Cq", "iClkw"
                    });
                    break;

                case 13: // '\r'
                    as = (new String[] {
                        "ship", "forest", "rust", "floor", "pocket", "web", "prison", "class"
                    });
                    as1 = (new String[] {
                        "jhwz", "jMgl", "jMg", "zmIn", "jyb", "jwlw", "jyl", "jmwq"
                    });
                    break;

                case 14: // '\016'
                    as = (new String[] {
                        "flag", "waterfall", "broom"
                    });
                    as1 = (new String[] {
                        "JMfw", "Jrnw", "JwVU"
                    });
                    break;

                case 15: // '\017'
                    as = (new String[] {
                        "tomato"
                    });
                    as1 = (new String[] {
                        "tmwtr"
                    });
                    break;

                case 16: // '\020'
                    as = (new String[] {
                        "stamp", "cold"
                    });
                    as1 = (new String[] {
                        "T`pw", "TMfw"
                    });
                    break;

                case 17: // '\021'
                    as = (new String[] {
                        "frog", "box"
                    });
                    as1 = (new String[] {
                        "f`fU", "f`bw"
                    });
                    break;

                case 18: // '\022'
                    as = (new String[] {
                        "drum", "lid", "shield"
                    });
                    as1 = (new String[] {
                        "Fol", "Fk`x", "Fwl"
                    });
                    break;

                case 19: // '\023'
                    as = (new String[] {
                        "fast", "parrot", "three", "lock", "clap", "walk", "photo", "water-melon"
                    });
                    as1 = (new String[] {
                        "qyz", "qoqw", "iqMn", "qwlw", "qwlI", "qurnw", "qsvIr", "qrbUz"
                    });
                    break;

                case 20: // '\024'
                    as = (new String[] {
                        "plate", "tired"
                    });
                    as1 = (new String[] {
                        "QwlI", "Qkxw"
                    });
                    break;

                case 21: // '\025'
                    as = (new String[] {
                        "inkpot", "turban", "grandfather", "grandmother", "milk", "heart", "south", "pulse"
                    });
                    as1 = (new String[] {
                        "dvwq", "dsqwr", "dwdw", "dwdI", "du`D", "idl", "d`Kx", "dwl"
                    });
                    break;

                case 22: // '\026'
                    as = (new String[] {
                        "earth", "thread", "wash", "daughter"
                    });
                    as1 = (new String[] {
                        "DrqI", "Dwgw", "Doxw", "DI"
                    });
                    break;

                case 23: // '\027'
                    as = (new String[] {
                        "measure", "lemon", "nose", "pear"
                    });
                    as1 = (new String[] {
                        "nwpxw", "nINbU", "nwk", "nwK"
                    });
                    break;

                case 24: // '\030'
                    as = (new String[] {
                        "leaf", "bird", "five", "son", "sin", "wings", "father", "generation", "bridge", "love", 
                        "swing", "east", "west"
                    });
                    as1 = (new String[] {
                        "p`qw", "pMCI", "pMj", "pu`qr", "pwp", "pMK/pr", "ipqw/ipa", "pIVI", "pu`l", "p@ym/ipAwr", 
                        "pING", "pUrb", "p`Cm"
                    });
                    break;

                case 25: // '\031'
                    as = (new String[] {
                        "fruit", "flower", "army"
                    });
                    as1 = (new String[] {
                        "Pl", "Pu`l", "POj"
                    });
                    break;

                case 26: // '\032'
                    as = (new String[] {
                        "cat", "duck", "speak", "garden", "monkey", "kid", "wednesday", "almond", "goat", "wolf"
                    });
                    as1 = (new String[] {
                        "ib`lI", "bq^", "bolxw", "bwZ/bgIcw", "bWdr", "b`cw", "bu`Dvwr", "bdwm", "bkrI", "biGAwV"
                    });
                    break;

                case 27: // '\033'
                    as = (new String[] {
                        "bear", "sheep", "forget", "sister", "crowd"
                    });
                    as1 = (new String[] {
                        "BwlU", "Byf", "Bu`lxw", "BYx", "BIV"
                    });
                    break;

                case 28: // '\034'
                    as = (new String[] {
                        "fish", "peacock", "my", "table", "temple", "mother", "forehead", "shoulder", "tuesday", "butter"
                    });
                    as1 = (new String[] {
                        "m`ClI", "mor", "myrw", "myz", "mMdr", "mW", "mwQw", "moFw", "mMglvwr", "m`Kx"
                    });
                    break;

                case 29: // '\035'
                    as = (new String[] {
                        "memorial"
                    });
                    as1 = (new String[] {
                        "Xwdgwr"
                    });
                    break;

                case 30: // '\036'
                    as = (new String[] {
                        "color", "night", "way", "king", "quilt"
                    });
                    as1 = (new String[] {
                        "rMg", "rwq", "rwh", "rwjw", "rjweI"
                    });
                    break;

                case 31: // '\037'
                    as = (new String[] {
                        "fox", "garlic", "essay", "write"
                    });
                    as1 = (new String[] {
                        "lomVI", "l`sx", "lyK", "ilKxw"
                    });
                    break;

                case 32: // ' '
                    as = (new String[] {
                        "calf", "wow", "bangles", "harmonium", "twenty", "thursday"
                    });
                    as1 = (new String[] {
                        "v`Cw", "vwh", "vMgW", "vwjw", "vIh", "vIrvwr"
                    });
                    break;
                }
                int j1 = randomi(as.length);
                WRONGengVersion[++i] = as[j1];
                WRONGpunjabiVersion[i] = as1[j1];
            }

        }

    }

    public String[] getWRONGEnglishWords()
    {
        return WRONGengVersion;
    }

    public String[] getWRONGPunjabiVersion()
    {
        return WRONGpunjabiVersion;
    }
}
