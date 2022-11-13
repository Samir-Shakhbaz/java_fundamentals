package labs_examples.enumerations.labs;

public class EnumParam {

    public enum EnumCard_2 {
        HEARTS(0), DIAMONDS(1), CLUBS(2), SPADES(3);
        private final int index;

        EnumCard_2(int index){
            this.index = index;
        }
        public int getIndex(){
            return index;
        }
    }

}
