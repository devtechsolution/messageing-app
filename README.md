# messageing-app
# HATEOAS Concept


#1.In HATEOAS there is concept call Resource.
    Resource<User> resource= new Resource<>(user);

#2.Then Add link to this resource
    ControllerLinkBuilder linkTo = ControllerLinkBuilder
            .linkTo(ControllerLinkBuilder
                    .methodOn(this.getClass())
                    .getAllUsers());
  ## Or static import ControllerLinkBuilder and then the above code will be

    import static org.springframework.hateoas.mvc.ControllerLinkBuilder.*;

    ControllerLinkBuilder linkTo = linkTo(methodOn(this.getClass())
                            .getAllUsers());
    resource.add(linkTo.withRel("all-users"));

## Input:
    server_Path/user/1

## Output:

{
    "id": 1,
    "name": "Ram ",
    "dob": "2019-01-27T04:55:11.791+0000",
    "_links": {
        "all-users": {
            "href": "http://localhost:7788/users"
        }
    }
}


