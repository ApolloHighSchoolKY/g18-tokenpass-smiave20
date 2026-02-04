public TokenPass(int playerCount){
  /*  to be answered in part (a) */
  
  //Creates board Array to be the size of playerCount
  board = new int[playerCount];

  //Fills it with random integer values from 1 to 10, 10 inclusive.
  playerCount = (Math.random()*10) +1;

  //Initializes currentPlayer to a random integer value in the range between 0 and playerCount-1, inclusive.
  for(int currentPlayer= 0; currentPlayer > playerCount-1; currentPlayer ++)
    
}

public void distributeCurrentPlayerTokens(){
  /* to be answered in part (b) */
  
}
