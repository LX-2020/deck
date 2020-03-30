//main class to instantiate deck and hand objects for dealing cards and display
import java.util.*;

public class Foothill
{
   static String result;
   static String dealCardString(Deck deck)
   {
      result = "";
      while(deck.topcard() > 0)
         result += deck.dealCard();
      
      return result;
   }

   
   public static void main(String[] args)
   {
      //phase 1:  
      Deck deck1, deck2, deck3, deck4;
      
      deck1 = new Deck(2);
      System.out.println("\n" + dealCardString(deck1));
      
      deck2 = new Deck(2);
      deck2.shuffle();
      System.out.println("\n" + dealCardString(deck2));
      
      deck3 = new Deck(1);
      System.out.println("\n" + dealCardString(deck3));
      
      deck4 = new Deck(1);
      deck4.shuffle();
      System.out.println("\n" + dealCardString(deck4));
      
      //phase 2:
      
      Scanner in = new Scanner(System.in);
      
      System.out.println("\n How many players in the game? (1 to 10) \n");
      int numplayer = in.nextInt();
      in.close();
      
      Deck deck5 = new Deck(1);
      Hand[] hands = new Hand[numplayer];
      for(int i =0; i < numplayer; i++)
      {
         hands[i] = new Hand();
      }
      
      /*deal cards to hands
      int currentIndex = 0;
      while(deck5.topcard() > 0)
      {
         hands[currentIndex].takeCard(deck5.dealCard());
         currentIndex++;
         currentIndex = currentIndex % numplayer;
      }   
      for(int i =0; i < numplayer; i++)
      {
         System.out.println(hands[i]);
      }*/
      
      int num_cards=deck5.topcard();
      int num_rounds=num_cards/numplayer;
      int remain=num_cards % numplayer;
      
      for(int round=0;round<num_rounds;round++)
         for(int i=0; i<numplayer; i++)
            hands[i].takeCard(deck5.dealCard());
      
      for(int i=0; i<remain; i++)
         hands[i].takeCard(deck5.dealCard());
      for(int i =0; i < numplayer; i++)
      {
         System.out.println(hands[i]);
      }     
      
      
      /*reset hand, shuffle cards, deal cards
      for(int i =0; i < numplayer; i++)
      {
         hands[i].resetHand();
      }
      
      Deck deck6 = new Deck(1);
      deck6.shuffle();
      
      currentIndex = 0;
      while(deck6.topcard() > 0)
      {
         hands[currentIndex].takeCard(deck6.dealCard());
         currentIndex++;
         currentIndex = currentIndex % numplayer;
      }
      System.out.println("\n Here are hands from shuffled deck");
      for(int i =0; i < numplayer; i++)
      {
         System.out.println(hands[i]);
      }*/
     
   }
}
      
   

/* ----------------run from console window--------------------
 
 K of Spades /  Q of Spades /  J of Spades /  T of Spades /  9 of Spades /  8 of
 Spades /  7 of Spades /  6 of Spades /  5 of Spades /  4 of Spades /  3 of Spad
es /  2 of Spades /  A of Spades /  K of Hearts /  Q of Hearts /  J of Hearts / 
 T of Hearts /  9 of Hearts /  8 of Hearts /  7 of Hearts /  6 of Hearts /  5 of
 Hearts /  4 of Hearts /  3 of Hearts /  2 of Hearts /  A of Hearts /  K of Diam
onds /  Q of Diamonds /  J of Diamonds /  T of Diamonds /  9 of Diamonds /  8 of
 Diamonds /  7 of Diamonds /  6 of Diamonds /  5 of Diamonds /  4 of Diamonds / 
 3 of Diamonds /  2 of Diamonds /  A of Diamonds /  K of Clubs /  Q of Clubs /  
J of Clubs /  T of Clubs /  9 of Clubs /  8 of Clubs /  7 of Clubs /  6 of Clubs
 /  5 of Clubs /  4 of Clubs /  3 of Clubs /  2 of Clubs /  A of Clubs /  K of S
pades /  Q of Spades /  J of Spades /  T of Spades /  9 of Spades /  8 of Spades
 /  7 of Spades /  6 of Spades /  5 of Spades /  4 of Spades /  3 of Spades /  2
 of Spades /  A of Spades /  K of Hearts /  Q of Hearts /  J of Hearts /  T of H
earts /  9 of Hearts /  8 of Hearts /  7 of Hearts /  6 of Hearts /  5 of Hearts
 /  4 of Hearts /  3 of Hearts /  2 of Hearts /  A of Hearts /  K of Diamonds / 
 Q of Diamonds /  J of Diamonds /  T of Diamonds /  9 of Diamonds /  8 of Diamon
ds /  7 of Diamonds /  6 of Diamonds /  5 of Diamonds /  4 of Diamonds /  3 of D
iamonds /  2 of Diamonds /  A of Diamonds /  K of Clubs /  Q of Clubs /  J of Cl
ubs /  T of Clubs /  9 of Clubs /  8 of Clubs /  7 of Clubs /  6 of Clubs /  5 o
f Clubs /  4 of Clubs /  3 of Clubs /  2 of Clubs /  A of Clubs / 

 Q of Hearts /  Q of Spades /  6 of Hearts /  J of Spades /  7 of Spades /  Q of
 Clubs /  7 of Clubs /  6 of Clubs /  J of Diamonds /  4 of Diamonds /  T of Spa
des /  4 of Hearts /  J of Clubs /  4 of Clubs /  2 of Diamonds /  A of Diamonds
 /  4 of Spades /  Q of Diamonds /  K of Clubs /  Q of Clubs /  3 of Clubs /  5 
of Clubs /  7 of Spades /  K of Hearts /  2 of Spades /  7 of Hearts /  5 of Spa
des /  7 of Hearts /  5 of Hearts /  A of Clubs /  T of Diamonds /  J of Hearts 
/  5 of Hearts /  9 of Spades /  4 of Spades /  T of Spades /  3 of Clubs /  9 o
f Diamonds /  3 of Spades /  8 of Diamonds /  K of Clubs /  5 of Clubs /  A of C
lubs /  T of Diamonds /  6 of Hearts /  8 of Spades /  2 of Hearts /  2 of Spade
s /  9 of Spades /  4 of Clubs /  4 of Hearts /  3 of Diamonds /  3 of Hearts / 
 K of Spades /  8 of Clubs /  J of Hearts /  2 of Hearts /  6 of Spades /  9 of 
Diamonds /  9 of Hearts /  2 of Diamonds /  2 of Clubs /  8 of Spades /  7 of Di
amonds /  T of Clubs /  A of Hearts /  A of Diamonds /  4 of Diamonds /  T of He
arts /  K of Diamonds /  6 of Diamonds /  J of Clubs /  3 of Spades /  T of Hear
ts /  8 of Diamonds /  8 of Hearts /  6 of Spades /  5 of Diamonds /  J of Diamo
nds /  2 of Clubs /  K of Diamonds /  A of Spades /  Q of Hearts /  6 of Diamond
s /  A of Hearts /  9 of Clubs /  7 of Clubs /  5 of Diamonds /  9 of Clubs /  3
 of Hearts /  A of Spades /  3 of Diamonds /  K of Hearts /  Q of Diamonds /  6 
of Clubs /  K of Spades /  7 of Diamonds /  8 of Clubs /  5 of Spades /  9 of He
arts /  T of Clubs /  Q of Spades /  8 of Hearts /  J of Spades / 

 K of Spades /  Q of Spades /  J of Spades /  T of Spades /  9 of Spades /  8 of
 Spades /  7 of Spades /  6 of Spades /  5 of Spades /  4 of Spades /  3 of Spad
es /  2 of Spades /  A of Spades /  K of Hearts /  Q of Hearts /  J of Hearts / 
 T of Hearts /  9 of Hearts /  8 of Hearts /  7 of Hearts /  6 of Hearts /  5 of
 Hearts /  4 of Hearts /  3 of Hearts /  2 of Hearts /  A of Hearts /  K of Diam
onds /  Q of Diamonds /  J of Diamonds /  T of Diamonds /  9 of Diamonds /  8 of
 Diamonds /  7 of Diamonds /  6 of Diamonds /  5 of Diamonds /  4 of Diamonds / 
 3 of Diamonds /  2 of Diamonds /  A of Diamonds /  K of Clubs /  Q of Clubs /  
J of Clubs /  T of Clubs /  9 of Clubs /  8 of Clubs /  7 of Clubs /  6 of Clubs
 /  5 of Clubs /  4 of Clubs /  3 of Clubs /  2 of Clubs /  A of Clubs / 

 5 of Clubs /  2 of Clubs /  7 of Diamonds /  J of Hearts /  A of Clubs /  2 of 
Spades /  6 of Spades /  Q of Diamonds /  K of Hearts /  3 of Hearts /  J of Spa
des /  8 of Hearts /  A of Diamonds /  T of Hearts /  8 of Diamonds /  Q of Club
s /  T of Spades /  9 of Diamonds /  7 of Clubs /  Q of Spades /  A of Hearts / 
 7 of Spades /  Q of Hearts /  6 of Hearts /  9 of Spades /  4 of Hearts /  5 of
 Hearts /  4 of Diamonds /  8 of Clubs /  9 of Hearts /  6 of Clubs /  T of Diam
onds /  7 of Hearts /  A of Spades /  J of Clubs /  6 of Diamonds /  4 of Spades
 /  5 of Spades /  5 of Diamonds /  J of Diamonds /  3 of Diamonds /  K of Spade
s /  K of Diamonds /  3 of Spades /  3 of Clubs /  K of Clubs /  2 of Diamonds /
  8 of Spades /  T of Clubs /  2 of Hearts /  9 of Clubs /  4 of Clubs / 
  
  How many players in the game? (1 to 10) 

3

 This hand has: 
 K of Spades /  T of Spades /  7 of Spades /  4 of Spades /  A of Spades /  J of
 Hearts /  8 of Hearts /  5 of Hearts /  2 of Hearts /  Q of Diamonds /  9 of Di
amonds /  6 of Diamonds /  3 of Diamonds /  K of Clubs /  T of Clubs /  7 of Clu
bs /  4 of Clubs /  A of Clubs / 

 This hand has: 
 Q of Spades /  9 of Spades /  6 of Spades /  3 of Spades /  K of Hearts /  T of
 Hearts /  7 of Hearts /  4 of Hearts /  A of Hearts /  J of Diamonds /  8 of Di
amonds /  5 of Diamonds /  2 of Diamonds /  Q of Clubs /  9 of Clubs /  6 of Clu
bs /  3 of Clubs / 

 This hand has: 
 J of Spades /  8 of Spades /  5 of Spades /  2 of Spades /  Q of Hearts /  9 of
 Hearts /  6 of Hearts /  3 of Hearts /  K of Diamonds /  T of Diamonds /  7 of 
Diamonds /  4 of Diamonds /  A of Diamonds /  J of Clubs /  8 of Clubs /  5 of C
lubs /  2 of Clubs / 

 Here are hands from shuffled deck

 This hand has: 
 7 of Diamonds /  2 of Diamonds /  3 of Hearts /  2 of Clubs /  8 of Hearts /  7
 of Clubs /  9 of Spades /  7 of Spades /  3 of Diamonds /  J of Hearts /  T of 
Diamonds /  4 of Hearts /  9 of Diamonds /  9 of Hearts /  3 of Spades /  5 of S
pades /  T of Clubs /  K of Hearts / 

 This hand has: 
 8 of Spades /  Q of Diamonds /  5 of Clubs /  9 of Clubs /  5 of Hearts /  8 of
 Clubs /  4 of Spades /  Q of Spades /  3 of Clubs /  K of Spades /  2 of Spades
 /  J of Clubs /  6 of Clubs /  7 of Hearts /  K of Diamonds /  8 of Diamonds / 
 A of Diamonds / 

 This hand has: 
 A of Clubs /  T of Spades /  J of Spades /  4 of Clubs /  A of Hearts /  Q of H
earts /  A of Spades /  6 of Hearts /  T of Hearts /  2 of Hearts /  J of Diamon
ds /  Q of Clubs /  6 of Diamonds /  5 of Diamonds /  6 of Spades /  4 of Diamon
ds /  K of Clubs / 




-----------------------------------------------*/
