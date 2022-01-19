# Bank API

1 POST endpoint, accepts JSON ([example](postman/bank-application.json)).<br/>
Response (also JSON): 200 HTTP code with a random UUID and "success" status or 400 code with "failed" status.<br/>
There are 50% chance of "success" response.

### Build
Use `gradle build` to build \*.jar<br/>
Run it with [Integration API](https://github.com/staffsterr2000/test-assignment-integration-api) \*.jar and enjoy!
