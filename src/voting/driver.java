package voting;

public class Driver {
	
	static VotingModel vm = new VotingModel();
	static VotingController vc = new VotingController();
	static VotingView vv = new VotingView();

	
	
	
	public static void main(String[] args)
	{
		vv.setModel(vm);
		vc.setModel(vm);
		vc.setView(vv);
		
		
		vc.askForNumber();
	}

}
