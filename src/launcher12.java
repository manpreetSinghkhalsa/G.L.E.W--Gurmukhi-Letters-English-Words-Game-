import java.io.PrintStream;

class launcher12
{

    public launcher12()
    {
        pics pics1 = new pics();
        Words words = new Words();
        int ai[] = pics1.generateOrder();
        String as[] = pics1.getPikNames();
        words.optio(ai);
        String as1[] = words.getEnglishWords();
        String as2[] = words.getPunjabiVersion();
        String as3[] = words.getWRONGEnglishWords();
        String as4[] = words.getWRONGPunjabiVersion();
        int i = -1;
        words.getWrongAnswers(ai);
        for(int j = 0; j < ai.length; j++)
        {
            for(int k = 0; k < 3; k++)
            {
                System.out.println((new StringBuilder()).append(as[ai[j]]).append("\t").append(as3[++i]).append("\t").append(as4[i]).toString());
            }

        }

    }
}
