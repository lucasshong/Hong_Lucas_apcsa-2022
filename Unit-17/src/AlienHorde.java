//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

public class AlienHorde
{
	private boolean bool = false;
	private List<Alien> aliens;

	public AlienHorde(int size)
	{
		int x = 20;
		int y = 25;
		aliens = new ArrayList<Alien>();
		for(int i = 0; i<size; i++){
			aliens.add(new Alien(x,y));
			x+=60;
			if(x>=725){
				x=20;
				y+=45;
			}
		}
	}

	public void add(Alien al)
	{
		aliens.add(new Alien());
	}

	public void drawEmAll( Graphics window )
	{
		for(int i = 0; i<aliens.size(); i++){
		aliens.get(i).draw(window);
		}
	}

	public void moveEmAll()
	{
		for(int i = 0; i<aliens.size();i++){
			if(aliens.get(i).getX()<=15){
				bool=true;
				for(int b = 0; b<15;b++){
					for(int h = 0; h<aliens.size();h++){
						aliens.get(h).move("down");
					}
				}
				
			}
			if(aliens.get(i).getX()>=725){
				bool=false;
				for(int z = 0; z<15;z++){
					for(int j = 0; j<aliens.size();j++){
						aliens.get(j).move("down");
					}
				}
			}
			if(bool){
				aliens.get(i).move("right");
			}else{
				aliens.get(i).move("left");
			}
		}
	}

	public ArrayList<Ammo> removeDeadOnes(List<Ammo> shots)
	{
		ArrayList<Ammo> hit = new ArrayList<Ammo>();
		for(int i = 0; i<shots.size();i++){
			for(int j = 0; j<aliens.size();j++){
				if((shots.get(i).getX()>=aliens.get(j).getX() && shots.get(i).getX()<=aliens.get(j).getX()+aliens.get(j).getWidth()) || (shots.get(i).getX()+10>=aliens.get(j).getX() && shots.get(i).getX()+10<=aliens.get(j).getX()+aliens.get(j).getWidth())){
					if(shots.get(i).getY()>=aliens.get(j).getY() && shots.get(i).getY()<=aliens.get(j).getY()+aliens.get(j).getHeight()){
						aliens.remove(j);
						j--;
						hit.add(shots.get(i));
					}
				}
			}
		}
		return hit;
	}
	

	public String toString()
	{
		return "";
	}

	public String getSize() {
		// TODO Auto-generated method stub
		return getSize();
	}
}
