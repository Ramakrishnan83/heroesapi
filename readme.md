Comics REST API
Build an API to retrieve Hero and additional information about heroes

API Specifications

Resource Summary
URI	                                HTTP Method	HTTP Status	Description
comics.com/api/heroes	            GET	200 OK	Return a list of heroes.
comics.com/api/heroes/<heroe_id>	GET	200 OK	Return an existing heroe.


GET /api/heroes
Response Body:
[
{
“Id”:”1”,
“Heroname”: “WonderMan”
},
{
“Id”:”2”,
“Heroname”: “WonderWoman”
},
]

GET /api/heroes/name
Response Body:
{
“Id”:”1”
“heroName”: “WonderMan”,
“ image” :”http://google.com”
“realName” : “WonderMan”
“height” : “6.0”,
“weight”:”150”,
“specialPower:”Test”,
“intelligence”: “Test”,
“strength” : “Test”,
“power”:”Test”,
“speed”: “Test”,
“agility”: “Test”,
“description”:”Test”,
“story” : “Test”


}
