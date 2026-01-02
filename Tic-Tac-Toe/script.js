const cells = document.querySelectorAll(".cell");
const startBtn = document.getElementById("start");
const resetBtn = document.getElementById("reset");
const turnText = document.getElementById("turn");

let currentPlayer = "❌";
let gameActive = false;
let board = ["", "", "", "", "", "", "", "", ""];

const winPatterns = [
    [0,1,2], [3,4,5], [6,7,8],
    [0,3,6], [1,4,7], [2,5,8],
    [0,4,8], [2,4,6]
];

startBtn.addEventListener("click", () => {
    gameActive = true;
    turnText.innerHTML = "Current Turn: Player ❌";
});

cells.forEach((cell, index) => {
    cell.addEventListener("click", () => {
        if (!gameActive || board[index] !== "") return;

        board[index] = currentPlayer;
        cell.innerHTML = currentPlayer;

        if (checkWinner()) {
            turnText.innerHTML = `🎉 Player ${currentPlayer} Wins!`;
            gameActive = false;
            return;
        }

        if (!board.includes("")) {
            turnText.innerHTML = "😐 It's a Draw!";
            gameActive = false;
            return;
        }

        currentPlayer = currentPlayer === "❌" ? "⭕" : "❌";
        turnText.innerHTML = `Current Turn: Player ${currentPlayer}`;
    });
});

resetBtn.addEventListener("click", resetGame);

function checkWinner() {
    return winPatterns.some(pattern => {
        return pattern.every(index => board[index] === currentPlayer);
    });
}

function resetGame() {
    board = ["", "", "", "", "", "", "", "", ""];
    cells.forEach(cell => cell.innerHTML = "");
    currentPlayer = "❌";
    gameActive = true;
    turnText.innerHTML = "Game Reset! Player ❌ Starts";
}
