import { Component } from '@angular/core';
import { MatCardModule } from '@angular/material/card';
import { MatIconModule } from '@angular/material/icon';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatSelectModule } from '@angular/material/select';
import { Movie } from '../models/movie.model';
import { CommonModule } from '@angular/common'; 
@Component({
  selector: 'app-movie-list',
  imports: [MatCardModule,
    MatIconModule,
    MatFormFieldModule,
    MatSelectModule,CommonModule],
  templateUrl: './movie-list.component.html',
  styleUrl: './movie-list.component.css'
})
export class MovieListComponent {

selectedGenre: string = 'All';
  
    movies: Movie[] = [
      {
        title: 'Hi Nanna',
        poster: "/asserts/poster-1.jpg",
        genre: 'Romace',
        rating: 4.5,
        description: 'An emotional journey of a father and daughter with a love story at its heart.'
      },
      {
         title: 'Kalki 2898 AD',
         poster: "/asserts/poster-2.jpg",
        genre: 'Sci-Fi',
        rating: 5,
        description: 'A futuristic epic set in a dystopian world.'
      },
      {
        title: 'Avengers',
        poster: "/asserts/poster-3.jpg",
        genre: 'Action',
        rating: 5,
        description: 'Superheroes unite to save the world.'
      },
      {
         title: 'F1',
        poster: "/asserts/poster-4.jpg",
        genre: 'Action',
        rating: 4,
        description: 'A thrilling story around Formula 1 racing.'
      }
    ];
  
    get genres(): string[] {
      return ['All', ...new Set(this.movies.map(m => m.genre))];
    }
  
    get filteredMovies(): Movie[] {
      return this.selectedGenre === 'All'
        ? this.movies
        : this.movies.filter(m => m.genre === this.selectedGenre);
    }
  
    get averageRating(): number {
      return this.filteredMovies.length
        ? this.filteredMovies.reduce((sum, m) => sum + m.rating, 0) / this.filteredMovies.length
        : 0;
    }
  
    isTopRated(movie: Movie): boolean {
      return movie.rating === Math.max(...this.filteredMovies.map(m => m.rating));
    }
  
  
}
