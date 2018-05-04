export default function languagesReducer(state = {}, action) {
  let myState = {};
  switch(action.type) {
    case 'LOAD_INIT': {
      return state;
    }
    default:
      return state;
  }
}
