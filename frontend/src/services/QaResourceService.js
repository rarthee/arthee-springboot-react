import axios from 'axios';
const QA_Resource_Service_API = 'http://localhost:8091/api/resources';
//const QA_Resource_Service_API = 'https://8091-cs-7b4ffbe9-9e62-498e-a9af-3e2ddc2c7129.cs-asia-southeast1-bool.cloudshell.dev/api/resources';
class QaResourceService {
    getResources() {

        return axios.get(QA_Resource_Service_API);
  }

  
}

// eslint-disable-next-line import/no-anonymous-default-export
export default new QaResourceService();