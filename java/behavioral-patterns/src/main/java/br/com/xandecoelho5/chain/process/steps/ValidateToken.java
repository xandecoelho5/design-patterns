package br.com.xandecoelho5.chain.process.steps;

import br.com.xandecoelho5.chain.process.repository.UserRepository;
import br.com.xandecoelho5.chain.process.service.ProcessContext;

public class ValidateToken extends ProcessStep {

    public ValidateToken(Object... args) {
        super(args);
    }

    @Override
    public ProcessContext execute(ProcessContext context) throws Exception {
        String token = (String) context.get("token");
        String email = token.toLowerCase();
        Object user = UserRepository.getInstance().getUserByEmail(email);
        if (user == null) throw new Exception("Invalid token!");

        return next(context, true);
    }

}
