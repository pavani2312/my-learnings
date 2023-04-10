/*//Rock, Paper and Scissors Game
let playGame = confirm("Shall we play a game(Rock, Paper, Scissors)")
if(playGame)
{
 let playerChoice = prompt("Select rock, paper or scissors")
 if(playerChoice)
 {
     let playerOne = playerChoice.trim().toLowerCase();
     if(playerOne === "rock" || playerOne === "paper" || playerOne ==="scissors")
     {
         let computerChoice = Math.floor(Math.random() * 3 + 1)
         let computer = computerChoice === 1 ? "rock"
         : computerChoice === 2 ? "paper"
         : "scissors"
         let result = playerOne === computer ? `Tie Game`
         : playerOne === "rock" && computer === "paper" ? `playerOne choosed ${playerOne}\n computer choosed ${computer} \n Computer wins!!`
         : playerOne === "paper" && computer === "scissors" ? `playerOne choosed ${playerOne}\n computer choosed ${computer} \n Computer wins!!`
         : playerOne === "scissors" && computer === "rock" ? `playerOne choosed ${playerOne}\n computer choosed ${computer} \n Computer wins!!`
         :  `playerOne choosed ${playerOne}\n computer choosed ${computer} \n PlayOne wins!!`;

         alert(result)
         let playAgain = confirm("Want to play once more!!")
         playAgain ? location.reload() : alert("Ok! thanks for playing");
        }
     else
     alert("you haven't selected your choice from rock, paper or scissors")
    }
 else
 alert("Ok again! I understood your not interested let's meet next time")
}
else
alert("Ok! you are not interested let's play some other time")


//Game creation with functions
const initGame = () => {
    const startGame = confirm("Shall we play rock, paper, or scissors?");
    startGame ? playGame() : alert("Ok, maybe next time.");
  };
  
  // Game flow function
  const playGame = () => {
    while (true) {
      let playerChoice = getPlayerChoice();
      playerChoice = formatPlayerChoice(playerChoice);
      if (playerChoice === "") {
        invalidChoice();
        continue;
      }
      if (!playerChoice) {
        decidedNotToPlay();
        break;
      }
      playerChoice = evaluatePlayerChoice(playerChoice);
      if (!playerChoice) {
        invalidChoice();
        continue;
      }
      const computerChoice = getComputerChoice();
      const result = determineWinner(playerChoice, computerChoice);
      displayResult(result);
      if (askToPlayAgain()) {
        continue;
      } else {
        thanksForPlaying();
        break;
      }
    }
  };
  
  const getPlayerChoice = () => {
    return prompt("Please enter rock, paper, or scissors.");
  };
  
  const formatPlayerChoice = (playerChoice) => {
    if (playerChoice || playerChoice === "") {
      return playerChoice.trim().toLowerCase();
    } else {
      return false;
    }
  };
  
  const decidedNotToPlay = () => {
    alert("I guess you changed your mind. Maybe next time.");
  };
  
  const evaluatePlayerChoice = (playerChoice) => {
    if (
      playerChoice === "rock" ||
      playerChoice === "paper" ||
      playerChoice === "scissors"
    ) {
      return playerChoice;
    } else {
      return false;
    }
  };
  
  const invalidChoice = () => {
    alert("You didn't enter rock, paper, or scissors.");
  };
  
  const getComputerChoice = () => {
    const randomNumber = Math.floor(Math.random() * 3);
    const rpsArray = ["rock", "paper", "scissors"];
    return rpsArray[randomNumber];
  };
  
  const determineWinner = (player, computer) => {
    const winner =
      player === computer
        ? "Tie game!"
        : player === "rock" && computer === "paper"
        ? `playerOne: ${player}\nComputer: ${computer}\nComputer wins!`
        : player === "paper" && computer === "scissors"
        ? `playerOne: ${player}\nComputer: ${computer}\nComputer wins!`
        : player === "scissors" && computer === "rock"
        ? `playerOne: ${player}\nComputer: ${computer}\nComputer wins!`
        : `playerOne: ${player}\nComputer: ${computer}\nplayerOne wins!`;
  
    return winner;
  };
  
  const displayResult = (result) => {
    alert(result);
  };
  
  const askToPlayAgain = () => {
    return confirm("Play Again?");
  };
  
  const thanksForPlaying = () => {
    alert("Ok, thanks for playing.");
  };
  
  initGame();*/

export default function eating() {
  return "I like Eating";
}

export const sleeping = () => {
  return "I like Sleeping";
}

export const playing = () => {
  return "I like Playing";
}