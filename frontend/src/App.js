import './App.css';
import 'bootstrap/dist/css/bootstrap.min.css';
import { Table } from 'react-bootstrap';
import ResourceComponent from './components/ResourceComponent';

function App() {
  return (
    <>
          <div className='p-5'>
              <h1 className="text-center"> QA Resources List</h1>
              <Table striped bordered hover>
                <ResourceComponent/>

              </Table>
          </div>
    
    </>
     
  );
};

export default App;
