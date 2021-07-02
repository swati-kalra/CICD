public class BlockCoverage {

    public int countOfWordsEndingWithUAndE(String str){
        int words = 0;
        char last = ' ';

        for(int i = 0; i < str.length(); i++){
            if(!Character.isLetter(str.charAt(i)) && (last == 'u' || last == 'e')){
                words++;
            }
            last = str.charAt(i);
        }

        if(last == 'u' || last == 'e'){
            words++;
        }
        return words;
    }
}
