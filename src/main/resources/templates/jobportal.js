// JavaScript code
document.addEventListener('DOMContentLoaded', function() {
    // Code to run after the HTML document has finished loading

    // Accessing HTML elements
    var searchForm = document.querySelector('#search form');
    var searchInput = document.querySelector('#search-input');
    var locationInput = document.querySelector('#location-input');

    // Event listener for form submission
    searchForm.addEventListener('submit', function(event) {
        event.preventDefault();

        // Get the values entered in the search form
        var keywords = searchInput.value;
        var location = locationInput.value;

        // Perform search or any other actions
        // ...

        // Clear the form inputs
        searchInput.value = '';
        locationInput.value = '';
    });
});