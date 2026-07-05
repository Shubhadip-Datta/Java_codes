package Inheritance;

public class Train {

		String train_name = "Bhadrak Express";
		int train_no = 18043;
		String source;
		String destination;
		int stoppage_count;
		
		public Train() {
			System.out.println("This is public train");
		}
		
		public Train(String train_name) {
			this.train_name = train_name;
		}
		
		void utility() {
			System.out.println("Cover distance within short span of time");
		}

		void service() {
			System.out.println("Poor service...");
		}

}
