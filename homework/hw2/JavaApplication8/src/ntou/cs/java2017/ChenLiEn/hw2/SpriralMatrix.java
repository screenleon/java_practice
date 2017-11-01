/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ntou.cs.java2017.ChenLiEn.hw2;

/**
 *
 * @author user
 */
public class SpriralMatrix {
    public enum Rotation{ CLOCKWISE, COUNTERCLOCKWISE };
    public enum Roundabout{ INNER, OUTER};
    public enum Direction{
        RIGHT, DOWN, LEFT, UP
    }
    
    private int matrixLength = 0;
    private int[][] matrix;
    private Rotation rotation;
    private Roundabout roundabout;
    private Direction direction;
    private int value = 1;
    
    public SpriralMatrix(int _rotation, int _roundabout, int _length){
        switch(_rotation){
            case 1:
                this.rotation = Rotation.CLOCKWISE;
                break;
            case 2:
                this.rotation = Rotation.COUNTERCLOCKWISE;
                break;
        }
        
        switch(_roundabout){
            case 1:
                this.roundabout = Roundabout.INNER;
                break;
            case 2:
                this.roundabout = Roundabout.OUTER;
                break;
        }
        
        this.matrixLength = _length;
        this.matrix = new int[_length][_length];
        this.initialArray();
    }
    
    public Direction getDirection(int row, int col){
        Direction nextDirection = this.direction;
        if(this.roundabout == Roundabout.INNER){
            if(this.rotation == Rotation.CLOCKWISE){
                if(this.direction == Direction.LEFT){
                    if(col == 0 || this.matrix[row - 1][col] == 0)
                        nextDirection = Direction.UP;
                }else if(this.direction == Direction.UP){
                    if(row == 0 || this.matrix[row][col + 1] == 0)
                        nextDirection = Direction.RIGHT;
                }else if(this.direction == Direction.RIGHT){
                    if(col == this.matrixLength - 1 || this.matrix[row + 1][col] == 0)
                        nextDirection = Direction.DOWN;
                }else if(this.direction == Direction.DOWN){
                    if(row == this.matrixLength - 1 || this.matrix[row][col - 1] == 0)
                        nextDirection = Direction.LEFT;
                }
            }else{
                if(this.direction == Direction.RIGHT){
                    if(col == this.matrixLength - 1 || this.matrix[row - 1][col] == 0)
                        nextDirection = Direction.UP;
                }else if(this.direction == Direction.UP){
                    if(row == 0 || this.matrix[row][col - 1] == 0)
                        nextDirection = Direction.LEFT;
                }else if(this.direction == Direction.LEFT){
                    if(col == 0 || this.matrix[row + 1][col] == 0)
                        nextDirection = Direction.DOWN;
                }else if(this.direction == Direction.DOWN){
                    if(row == this.matrixLength - 1 || this.matrix[row][col + 1] == 0)
                        nextDirection = Direction.RIGHT;
                }
            }
        }else{
            if(this.rotation == Rotation.CLOCKWISE){
                if(this.direction == Direction.RIGHT){
                    if(col == this.matrixLength - 1 || this.matrix[row][col + 1] != 0)
                        nextDirection = Direction.DOWN;
                }else if(this.direction == Direction.DOWN){
                    if(row == this.matrixLength - 1 || this.matrix[row + 1][col] != 0)
                        nextDirection = Direction.LEFT;
                }else if(this.direction == Direction.LEFT){
                    if(col == 0 || this.matrix[row][col - 1] != 0)
                        nextDirection = Direction.UP;
                }else if(this.direction == Direction.UP){
                    if(row == 0 || this.matrix[row - 1][col] != 0)
                        nextDirection = Direction.RIGHT;
                }
            }else{
                if(this.direction == Direction.DOWN){
                    if(row == this.matrixLength - 1 || this.matrix[row + 1][col] != 0)
                        nextDirection = Direction.RIGHT;
                }else if(this.direction == Direction.RIGHT){
                    if(col == this.matrixLength - 1 || this.matrix[row][col + 1] != 0)
                        nextDirection = Direction.UP;
                }else if(this.direction == Direction.UP){
                    if(row == 0 || this.matrix[row - 1][col] != 0)
                        nextDirection = Direction.LEFT;
                }else if(this.direction == Direction.LEFT){
                    if(col == 0 || this.matrix[row][col - 1] != 0)
                        nextDirection = Direction.DOWN;
                }
            }
        }
        return nextDirection;
    }
    
    public void initialArray(){
        int row = 0;
        int col = 0;
        switch(this.roundabout){
            case INNER:
                row = (this.matrixLength - 1) / 2;
                col = (this.matrixLength - 1) / 2;
                break;
            case OUTER:
                row = 0;
                col = 0;
                break;
        }
        switch(this.rotation){
            case CLOCKWISE:
                this.direction = Direction.RIGHT;
                break;
            case COUNTERCLOCKWISE:
                this.direction = Direction.DOWN;
                break;
        }
        
        for (int _i = 0; _i < this.matrixLength * this.matrixLength; _i++) {  
            this.matrix[row][col] = value;
            this.direction = this.getDirection(row, col);
            value++;
            switch (direction) {  
            case RIGHT:  
                col++;  
                break;  
            case DOWN:  
                row++;  
                break;  
            case LEFT:  
                col--;  
                break;  
            case UP:  
                row--;  
                break;  
            }  
              
        }  
    }
    
    public void showArray(){
        for (int _i = 0; _i < this.matrixLength; _i++){
            for (int _j = 0; _j < this.matrixLength; _j++){
                System.out.printf("%2d   ", this.matrix[_i][_j]);
            }
            System.out.println();
        }
    }
}
