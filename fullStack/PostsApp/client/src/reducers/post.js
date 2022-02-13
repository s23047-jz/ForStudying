const reducer = (posts = [], action) => { //posts = state
  switch (action.type) {
    case 'FETCH_ALL':
      return action.payload;
    case 'CREATE':
      return [...posts, action.payload];
    case 'UPDATE':
    case 'LIKE':
      return posts.map((post) => post._id === action.payload._id ? action.payload : post); //Sprawdzamy czy id postu jest rowne aktualizowanemu postowi id, nastepnie zwracamy zaaktualizowany post w przeciwnym razie post bez zmian
    case "DELETE":
      return posts.filter(post => post._id !== action.payload);
    default:
      return posts;
  }
}

export default reducer;