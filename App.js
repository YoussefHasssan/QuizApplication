import './App.css';
import Button from 'react-bootstrap/Button';



async function getData() {

  // 'http://localhost:8182'

  fetch('http://127.0.0.1:5000/http://localhost:8182/GET').then(function (response) {
    return response.json();
  }).then(function (data) {
    console.log(data);
    document.getElementById("question-box").innerHTML = data["answer"];
  }).catch(function (e) {
    console.log(e);
  });
}



function App() {
  return (
      <div className="App">
        <header className="App-header">
          <p></p>
          <div id="question-box"></div>
          <Button onClick={getData}>
            Get Data
          </Button>
          <a>
            Learn React
          </a>
        </header>
      </div>
  );
}

export default App;
