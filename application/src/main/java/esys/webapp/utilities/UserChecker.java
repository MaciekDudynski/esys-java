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

    private User getUserProfile() throws Exception {
        if (!isLoged())
            throw new Exception("User needs to be connected first");
        String [] fields = { "id", "about", "age_range", "birthday", "context", "cover", "currency", "devices",
                "education", "email", "favorite_athletes", "favorite_teams", "first_name", "gender", "hometown",
                "inspirational_people", "installed", "install_type", "is_verified", "languages", "last_name",
                "link", "locale", "location", "meeting_for", "middle_name", "name", "name_format", "political",
                "quotes", "payment_pricepoints", "relationship_status", "religion", "security_settings",
                "significant_other", "sports", "test_group", "timezone", "third_party_id", "updated_time",
                "verified", "video_upload_limits", "viewer_can_send_gift", "website", "work"};
        return facebook.fetchObject("me", User.class, fields);
    }

    public boolean isLoged() {
        return !(connectionRepository.findPrimaryConnection(Facebook.class) == null);
    }

    public boolean isAdmin() throws Exception {
        return getUserProfile().getId().equals("1294987747236027");
    }

    public String getId() throws Exception {
        return getUserProfile().getId();
    }

    public String getFullName() throws Exception {
        return getUserProfile().getName();
    }

}
