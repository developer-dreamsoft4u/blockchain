# blockchain
blockchainPOC===

There is a java file for controller called WelcomController. 
There is a controller method "welcomeUser" which is use for calling blockchain methods such as 
"getblockchaininfo", "getnetworkinfo", "getwalletinfo", "getmininginfo" etc.

Use following URL in browser or api call plugin like postman etc.
"http://localhost:8085/welcome/user?methodName=getmininginfo"

You will get json like :-

{
    "result": {
        "blocks": 0,
        "currentblockweight": 0,
        "currentblocktx": 0,
        "difficulty": 4.656542373906925e-10,
        "networkhashps": 0,
        "pooledtx": 0,
        "chain": "regtest",
        "warnings": ""
    },
    "error": null,
    "id": null
}
