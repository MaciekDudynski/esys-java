package esys.webapp.utilities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.connect.ConnectionRepository;
import org.springframework.social.facebook.api.Facebook;
import org.springframework.social.facebook.api.User;
import org.springframework.stereotype.Component;

@Component
public class UserChecker {

    @Autowired
    private Facebook facebook;
    @Autowired
    private ConnectionRepository connectionRepository;

    public boolean isLoged() {
        return !(connectionRepository.findPrimaryConnection(Facebook.class) == null);
    }

    public User getInfo() throws Exception {
        if (!isLoged())
            throw new Exception("User needs to be connected first");
        String [] fields = { "id", "email", "first_name", "last_name", "name" };
        return facebook.fetchObject("me", User.class, fields);
    }

}
