import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet,FormsModule, CommonModule],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'todoApp';
   newTask: string = '';
  tasks: { name: string, done: boolean }[] = [];

  addTask() {
    if (this.newTask.trim() !== '') {
      this.tasks.push({ name: this.newTask, done: false });
      this.newTask = '';
    }
  }

  toggleTask(index: number) {
    this.tasks[index].done = !this.tasks[index].done;
  }

  removeTask(index: number) {
    this.tasks.splice(index, 1);
  }
}

