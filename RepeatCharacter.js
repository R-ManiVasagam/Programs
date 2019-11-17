/* Eg 1: Input: a1b10
       Output: abbbbbbbbbb
Eg: 2: Input: b3c6d15
          Output: bbbccccccddddddddddddddd
The number varies from 1 to 99. */
let GivenString="a10b20c2";
let CharacterList=GivenString.split(/[0-99]/).filter(function(val){return val!=""})
let NumberList=GivenString.split(/[a-z]/).filter(function(val){return val!=""})
for(let i=0;i<CharacterList.length;i++){
    for(let j=0;j< parseInt(NumberList[i]);j++)
    console.log(CharacterList[i])
}
