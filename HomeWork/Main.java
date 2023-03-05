public class Main{
	public static void main(String[] args){
		User user = new User("Bob");
		Persister p = new Persister(user);
		p.save();
		Report r = new Report(user);
		r.report();
	}
}