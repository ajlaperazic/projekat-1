package projekat;

import java.util.Scanner;

public class game {

	public static void main(String[] args) {
	
}

	public class player {
		private String name;
		private int x;
		private int y;
		private int width;
		private int height;
		private int health;
	
		
		public player(String name, int x, int y, int width, int height, int health) {
			super();
			this.name = name;
			this.x = x;
			this.y = y;
			this.width = width;
			this.height = height;
			this.health = health;		
	}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			name= name.trim();
		if (name.isEmpty())
			System.out.println("ime ne smije biti prazno");
			this.name = name;
		}


		public int getX() {
			return x;
		}


		public void setX(int x) {
			this.x = x;
		}


		public int getY() {
			return y;
		}


		public void setY(int y) {
			this.y = y;
		}


		public int getWidth() {
			return width;
		}


		public void setWidth(int width) {
			this.width = width;
		}


		public int getHeight() {
			return height;
		}


		public void setHeight(int height) {
			this.height = height;
		}


		public int getHealth() {
			return health;
		}


		public void setHealth(int health) {
			if (health < 0 || health > 100)
				System.out.println("health mora biti od 0 do 100");
			this.health = health;
		}

	
	}
	public class enemy {
		private String type;
	
		private int x;
		private int y;
		private int width;
		private int height;
		private int damage;
		
		
		
		public enemy(String type, int x, int y, int width, int height, int damage) {
			super();
			this.type = type;
			this.x = x;
			this.y = y;
			this.width = width;
			this.height = height;
			this.damage = damage;
			
			
		}


		public String getType() {
			return type;
		}


		public void setType(String type) {
			this.type = type;
		}


		public int getX() {
			return x;
		}


		public void setX(int x) {
			this.x = x;
		}


		public int getY() {
			return y;
		}


		public void setY(int y) {
			this.y = y;
		}


		public int getWidth() {
			return width;
		}


		public void setWidth(int width) {
			this.width = width;
		}


		public int getHeight() {
			return height;
		}


		public void setHeight(int height) {
			this.height = height;
		}


		public int getDamage() {
			return damage;
		}


		public void setDamage(int damage) {
			if (damage < 0 || damage > 100)
			System.out.println("damage mora biti od 0 do 100");
			
			this.damage = damage;
		}
		
		
		
}
}






