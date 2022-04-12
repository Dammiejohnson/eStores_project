package africa.catalystStores.data.models;

import lombok.*;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class User {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    @NonNull
    private String emailAddress;
    @NonNull
    private String password;
    private String homeAddress;



}
