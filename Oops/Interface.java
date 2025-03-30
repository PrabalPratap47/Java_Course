// public class Interface {
//     public static void main(String args[]){
//         queen q = new queen();
//         q.moves();
//     }
    
// }

// interface chessPlayer{
//      void moves();
// }

// class queen  implements chessPlayer{
//     public void moves() {   //if we don't use public moves function will  be default and to make it public like in chessplayer class we use public keyword here
//         System.out.println("Queen can move in any direction");
//     }
// }

// class rook  implements chessPlayer{
//     public void moves() {   //if we don't use public moves function will  be default and to make it public like in chessplayer class we use public keyword here
//         System.out.println("rook can move in any horizontal & vertical direction");
//     }
// }

// class pawn  implements chessPlayer{
//     public void moves() {   //if we don't use public moves function will  be default and to make it public like in chessplayer class we use public keyword here
//         System.out.println("pawn can move in diagonal direction");
//     }
// }




//--------------->Multiple parent class

// public class Interface {
//     public static void main(String args[]){
//         Bear b = new Bear();
//         b.eats();
//         b.walks();
//         b.runs();
//     }
// }

// interface herbivore{
//     void eats();
//     void walks();
// }

// interface carnivore{
//     void eats();
//     void runs();
// }

// class Bear implements herbivore,carnivore{
//         public void eats(){
//             System.out.println("Bear eats fish & grass");
//         }
//         public void walks(){
//             System.out.println("Bear walks");
//         }
//         public void runs(){
//             System.out.println("Bear runs");
//         }
// }

//we can see that abstract function eats,runs,walks are launched in herbivore and carnivore class 
//  and then those fucntions are defined in Bear class.









//-----------------> Super Keyword
public class Interface {
    public static void main(String[] args) {
        horse h = new horse();
        System.out.println(h.color);
    }
}

class animal{
    String color;
    animal(){
        System.out.println("animal constructor");
        
    }
}

class horse extends animal{
    horse(){
        super.color = "brown";
        System.out.println("horse constructor");
    }
}

    
