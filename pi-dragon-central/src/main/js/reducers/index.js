import {combineReducers} from 'redux';
import switches from '../switchCentral/switchCentral-reducer';


const rootReducer = combineReducers({switches});

export default rootReducer;
