import java.util.Random;

class pics
{

    private String pikName[] = {
        "Oo'rhaa(1)", "AAera", "Ee'rhee", "sas'saa", "haa'haa", "Kak'kaa", "khakh'khaa", "gag'gaa", "ghag'ghaa", "shash'shaa", 
        "chach'chaa", "chhachh'chhaa", "jaj'jaa", "jhaj'jhaa", "tain'kaa", "thath'thaa", "ddad'daa", "dhad'daa", "tat'taa", "thathathaaa", 
        "dad'daa", "dhad'daa(dhan)", "nan'naa", "pap'paa", "phaph'phaa", "bab'baa", "bhab'baa", "mam'maa", "yay'yaa", "ra'raa", 
        "lal'laa", "vav'vaa"
    };

    pics()
    {
    }

    int[] rnd(int i)
    {
        int ai[] = new int[i];
        Boolean aboolean[] = new Boolean[i];
        Random random = new Random();
        boolean flag = true;
        try
        {
            for(int j1 = 0; j1 < i; j1++)
            {
                aboolean[j1] = Boolean.valueOf(true);
            }

            int k = -1;
            int l = i - 1;
            int i1 = 0;
            while(++k < i) 
            {
                int j;
                for(j = random.nextInt((l - i1) + 1) + i1; !aboolean[j].booleanValue(); j = random.nextInt((l - i1) + 1) + i1) { }
                ai[k] = j;
                aboolean[j] = Boolean.valueOf(false);
            }
        }
        catch(Exception exception) { }
        return ai;
    }

    public String[] getPikNames()
    {
        return pikName;
    }

    public int[] generateOrder()
    {
        return rnd(pikName.length);
    }
}
