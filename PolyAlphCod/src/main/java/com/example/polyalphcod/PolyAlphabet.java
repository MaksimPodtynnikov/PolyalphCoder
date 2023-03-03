package com.example.polyalphcod;

public class PolyAlphabet {
    private static final String alphabet = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя., ";
    private static final String code = " йцукенгшщзхъфыва.,пролджэячсмитьбюё";
    private static final String secondCode = "яфйёчыцсвумакипе трньогблш.,юдщжзэхъ";
    public static String encrypt(String text)
    {
        StringBuilder newText= new StringBuilder();
        for (int j = 0; j < text.length(); j++)
            for (int i = 0; i < alphabet.length(); i++)
                if (text.charAt(j)==alphabet.charAt(i))
                    if (j % 2 == 0)
                        newText.append(code.charAt(i));
                    else newText.append(secondCode.charAt(i));
        return newText.toString();
    }
    public static String decipher(String text)
    {
        StringBuilder newText = new StringBuilder();
        for (int j = 0; j < text.length(); j++)
            if (j % 2 == 0)
            {
                for (int i = 0; i < code.length(); i++)
                    if (text.charAt(j) == code.charAt(i))
                        newText.append(alphabet.charAt(i));
            }
            else
                for (int i = 0; i < secondCode.length(); i++)
                    if (text.charAt(j) == secondCode.charAt(i))
                        newText.append(alphabet.charAt(i));
        return newText.toString();
    }
}
