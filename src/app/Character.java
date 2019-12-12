package app;

import javax.management.RuntimeErrorException;

class Character {
    
    private int lives;
    private boolean isBig;
    private boolean isInvulnerable; 
    private int score;

    Character(){
      //lives=3;
    }

    Character(int number){

        lives= number;
    }

    /**
     * @return the lives
     */
    public int getLives() {

        // vscode fait la methode tout seul 
        return lives;
    }


    public void  addLife(){
        lives++;
    }

    public void  loseLife(){
        if (hasLives()){
            lives--; 
        }else{
            System.out.println("Game over");
           
        }
        
    }

    public boolean  hasLives(){
        if (lives>0){
            return true;
        }else{
          return false;
        }
    }
    
    /**
     * @return the isBig
     */
    public boolean getIsBig() {
        return isBig;
    }

    public void pickUpMushroom(){

        isBig=true;
    }

    public void takeHit(){
        if(isInvulnerable==false){
            if(getIsBig()){
                isBig=false;
            }else{
                loseLife();
            }
        }
    }

    public void pickUpStar(){
        isInvulnerable=true;

    }

    public void invulnerableWearsOff(){

        isInvulnerable=false;
    }

    /**
     * @return the isInvulnerable
     */
    public boolean getIsInvulnerable() {
        return isInvulnerable;
    }

    public void pickUpCoin(){
        score+=200;
    }


    /**
     * @return the score
     */
    public int getScore() {
        return score;
    }

    public void killGoomba(){
        score+=100;
    }



}
