package br.com.xandecoelho5.chain.process.steps;

import br.com.xandecoelho5.chain.process.repository.UserRepository;
import br.com.xandecoelho5.chain.process.service.ProcessContext;

public class GetUsers extends ProcessStep {
	
	public GetUsers(Object... args) {
		super(args);
	}

	@Override
	public ProcessContext execute(ProcessContext context) throws Exception {
		Object users = UserRepository.getInstance().getUsers();
		context.put("users", users);
		return next(context, users);
	}

}
